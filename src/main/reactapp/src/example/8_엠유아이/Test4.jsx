import * as React from 'react';
import { Box, Card, IconButton, TextField, Button, Typography, CircularProgress } from '@mui/material';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import SettingsIcon from '@mui/icons-material/Settings';
import Brightness4Icon from '@mui/icons-material/Brightness4';
import Brightness7Icon from '@mui/icons-material/Brightness7';
import MinimizeIcon from '@mui/icons-material/Minimize';
import MaximizeIcon from '@mui/icons-material/Fullscreen';
import CloseIcon from '@mui/icons-material/Close';

export default function MemberInfo() {
  const [darkMode, setDarkMode] = React.useState(false); // 색상 모드 상태 추가
  const [mno, setMno] = React.useState(''); // 입력된 회원 번호
  const [memberData, setMemberData] = React.useState(null); // 회원 데이터
  const [loading, setLoading] = React.useState(false); // 로딩 상태
  const [error, setError] = React.useState(null); // 오류 상태

  const toggleColorMode = () => {
    setDarkMode(!darkMode); // 색상 모드 토글
  };

  const theme = createTheme({
    palette: {
      primary: {
        main: '#1976d2', // Blue 색상
      },
      secondary: {
        main: '#dc004e', // Pink 색상
      },
      mode: darkMode ? 'dark' : 'light', // darkMode 상태에 따라 모드 변경
    },
  });

  const handleSearch = async () => {
    setLoading(true);
    setError(null);
    try {
      const response = await fetch(`/member/info?mno=${mno}`, { method: 'GET' });
      const data = await response.json();
      if (response.ok) {
        setMemberData(data);
      } else {
        throw new Error('회원 정보를 가져오는 데 실패했습니다.');
      }
    } catch (error) {
      setError(error.message);
    } finally {
      setLoading(false);
    }
  };

  return (
    <ThemeProvider theme={theme}>
      <Box sx={{ display: 'flex', justifyContent: 'center', alignItems: 'center', height: '100vh', padding: '20px' }}>
        <Card variant="outlined" sx={{ width: '100%', maxWidth: '850px', padding: '50px', marginTop: '50px', borderRadius: '12px', position: 'relative' }}>
          {/* 최상단 오른쪽 버튼들 */}
          <Box sx={{ position: 'absolute', top: 5, right: 5, display: 'flex', gap: 3 }}>
            {/* 밝기 모드 전환 버튼 */}
            <IconButton color="primary" aria-label="color-mode-toggle" onClick={toggleColorMode} sx={{ fontSize: 30 }}>
              {darkMode ? <Brightness7Icon /> : <Brightness4Icon />}
            </IconButton>

            {/* 세팅 버튼 */}
            <IconButton color="primary" aria-label="settings" component="span" sx={{ fontSize: 30 }}>
              <SettingsIcon />
            </IconButton>

            {/* 나머지 아이콘 버튼들 */}
            <IconButton color="primary" aria-label="minimize" component="span" sx={{ fontSize: 30 }}>
              <MinimizeIcon />
            </IconButton>
            <IconButton color="primary" aria-label="maximize" component="span" sx={{ fontSize: 30 }}>
              <MaximizeIcon />
            </IconButton>
            <IconButton color="primary" aria-label="close" component="span" sx={{ fontSize: 30 }}>
              <CloseIcon />
            </IconButton>
          </Box>

          <Typography component="h1" variant="h4" sx={{ textAlign: 'center', marginBottom: '30px' }}>
            회원 정보 조회
          </Typography>

          <TextField
            label="사번 조회"
            value={mno}
            onChange={(e) => setMno(e.target.value)}
            fullWidth
            variant="outlined"
            sx={{ marginBottom: '20px' }}
          />

          <Button
            variant="contained"
            color="primary"
            onClick={handleSearch}
            fullWidth
            sx={{ marginBottom: '30px' }}
            disabled={loading}
          >
            {loading ? <CircularProgress size={24} sx={{ color: 'white' }} /> : '검색'}
          </Button>

          {error && <Typography sx={{ textAlign: 'center', color: 'red' }}>{error}</Typography>}

          {memberData && (
            <Box sx={{ display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
              <Typography variant="h6">사원 번호: {memberData.mno}</Typography>
              <Typography variant="h6">이름: {memberData.mname}</Typography>
              <Typography variant="h6">전화번호: {memberData.mphone}</Typography>
            </Box>
          )}
        </Card>
      </Box>
    </ThemeProvider>
  );
}
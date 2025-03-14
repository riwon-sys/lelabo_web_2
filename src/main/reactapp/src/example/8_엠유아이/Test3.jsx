import * as React from 'react';
import { Card, Box, Button, Typography, IconButton } from '@mui/material';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import SettingsIcon from '@mui/icons-material/Settings';
import Brightness4Icon from '@mui/icons-material/Brightness4';
import Brightness7Icon from '@mui/icons-material/Brightness7';
import ExitToAppIcon from '@mui/icons-material/ExitToApp';
import MinimizeIcon from '@mui/icons-material/Minimize';
import MaximizeIcon from '@mui/icons-material/Fullscreen';
import CloseIcon from '@mui/icons-material/Close';

export default function Logout() {
  const [darkMode, setDarkMode] = React.useState(false); // 색상 모드 상태 추가
  const [message, setMessage] = React.useState('로그인 후 사용하세요'); // 기본 메시지

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

  // 로그아웃 처리
  const handleLogout = () => {
    // 실제로는 서버로 로그아웃 요청을 보내거나 세션을 종료하는 처리가 필요함
    fetch('/member/logout', { method: 'POST' }) // 가상의 로그아웃 URL
      .then((response) => response.json())
      .then((data) => {
        if (data.success) {
          setMessage('로그아웃 성공');
        } else {
          setMessage('로그아웃 실패');
        }
      })
      .catch((error) => {
        console.error('Error:', error);
        setMessage('로그아웃 실패');
      });
  };

  return (
    <ThemeProvider theme={theme}>
      <Box sx={{ display: 'flex', justifyContent: 'center', alignItems: 'center', height: '100vh', padding: '20px' }}>
        <Card variant="outlined" sx={{ width: '100%', maxWidth: '850px', padding: '50px', marginTop: '50px', borderRadius: '12px', position: 'relative' }}>
          {/* 최상단 오른쪽 버튼들 */}
          <Box sx={{ position: 'absolute', top: 5, right: 5, display: 'flex', gap: 3 }}>
            {/* 밝기 모드 전환 버튼 추가 */}
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
            로그아웃 화면
          </Typography>

          <Typography sx={{ textAlign: 'center', marginBottom: '30px' }}>
            {message}
          </Typography>

          <Box sx={{ display: 'flex', justifyContent: 'center', gap: 2 }}>
            <Button variant="contained" color="primary" onClick={handleLogout} startIcon={<ExitToAppIcon />}>
              로그아웃
            </Button>
          </Box>
        </Card>
      </Box>
    </ThemeProvider>
  );
}

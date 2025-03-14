import * as React from 'react';
import { Card, Box, Button, TextField, Typography, IconButton } from '@mui/material';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import SettingsIcon from '@mui/icons-material/Settings';
import Brightness4Icon from '@mui/icons-material/Brightness4';
import Brightness7Icon from '@mui/icons-material/Brightness7';
import MinimizeIcon from '@mui/icons-material/Minimize';
import MaximizeIcon from '@mui/icons-material/Fullscreen';
import CloseIcon from '@mui/icons-material/Close';

export default function Login() {
  const [mno, setMno] = React.useState('');
  const [mpwd, setMpwd] = React.useState('');
  const [message, setMessage] = React.useState('');
  const [darkMode, setDarkMode] = React.useState(false); // 색상 모드 상태 추가

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

  const handleSubmit = (event) => {
    event.preventDefault();
    const data = {
      mno,
      mpwd,
    };

    // API 호출 (가상의 URL '/member/login'로 POST 요청)
    fetch('/member/login', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(data),
    })
      .then((response) => response.json())
      .then((data) => {
        if (data.success) {
          setMessage('로그인 성공');
        } else {
          setMessage('로그인 실패');
        }
      })
      .catch((error) => {
        console.error('Error:', error);
        setMessage('로그인 실패');
      });
  };

  return (
    <ThemeProvider theme={theme}>
      <Box sx={{ display: 'flex', justifyContent: 'center', alignItems: 'center', height: '100vh', padding: '20px' }}>
        <Card variant="outlined" sx={{ width: '100%', maxWidth: '850px', padding: '50px', marginTop: '50px', borderRadius: '12px', position: 'relative' }}>
          {/* 최상단 오른쪽 버튼들 (사원 등록 박스 내) */}
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
            로그인
          </Typography>

          <Box component="form" noValidate onSubmit={handleSubmit} sx={{ display: 'flex', flexDirection: 'column', gap: 2 }}>
            <TextField
              label="사원 번호"
              type="number"
              value={mno}
              onChange={(e) => setMno(e.target.value)}
              fullWidth
              required
              variant="outlined"
            />
            <TextField
              label="비밀번호"
              type="password"
              value={mpwd}
              onChange={(e) => setMpwd(e.target.value)}
              fullWidth
              required
              variant="outlined"
            />
            <Button type="submit" variant="contained" color="primary" fullWidth sx={{ marginTop: '20px' }}>
              로그인
            </Button>
          </Box>

          {message && <Typography sx={{ marginTop: '20px', textAlign: 'center' }}>{message}</Typography>}
        </Card>
      </Box>
    </ThemeProvider>
  );
}

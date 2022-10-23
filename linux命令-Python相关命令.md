清空终端：
clear



查看桌面系统：
env | grep DESKTOP_SESSION= 

切换root用户
sudo su

grep用法
是
ls |grep xxx
不是
ls grep|xxx
一定记住，别搞混了

# VIM
一般不要用vim，用gedit，不反人类
linux vi/vim保存退出，强制退出
linux退出vi/vim编辑器，一般需要先按 esc 先退出编辑模式。

1. 保存文件修改
:w      //按【:w】 保存文件
:w!          //按【:w!】 若文件为只读，强制保存文件
2. 退出文件
:q        //按【:q】 离开vi/vim
:q!      //按【:q!】 不保存强制离开vi
3. 保存并退出
:wq         //按【:wq】 保存后离开
:wq!        //按【:wq!】 强制保存后离开

自动挂载分区、硬盘：
https://www.linuxdashen.com/how-to-automount-file-systems-on-linux

# conda
清除conda 里多余的包，conda安装新版本的包的时候不会自动清楚老的包
conda clean -a
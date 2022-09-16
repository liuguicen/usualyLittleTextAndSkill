 //防止与虚拟按键冲突
//一定设置好参数之后再show,注意注意注意!!!!
pop.setSoftInputMode(PopupWindow.INPUT_METHOD_NEEDED);
pop.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
pop.showAtLocation(v, Gravity.LEFT | Gravity.BOTTOM, 0, 0);
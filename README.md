# clearscreen

![](https://img.shields.io/badge/version-1.0.0-brightgreen.svg)&#160;
![](https://img.shields.io/badge/license-Apache%202-blue.svg)

[**English**](https://github.com/lmxjw3/clearscreen/blob/master/README_EN.md)

直播间左滑或右滑清屏控件


### Import
```
implementation 'com.lmxjw3.widget:clearscreen:1.0.0'
```


### Usage

##### 1. 像使用 FrameLayout 一样在根布局使用 ClearScreenLayout。

##### 2. API
```
    // 添加需要滑动清屏的View
    addClearViews(View... views)
    
    // 移除需要滑动清屏的View
    removeClearViews(View... views)
    
    // 移除所有需要滑动清屏的View
    removeAllClearViews()
    
    // 设置滑动方向（左滑 or 右滑）
    setSlideDirection(SlideDirection direction)
    
    // 设置滑动监听器
    setOnSlideListener(OnSlideClearListener slideListener)
```
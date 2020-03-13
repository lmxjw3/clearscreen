# clearscreen

![](https://img.shields.io/badge/version-1.0.0-brightgreen.svg)&#160;
![](https://img.shields.io/badge/license-Apache%202-blue.svg)

[**中文版**](https://github.com/lmxjw3/clearscreen/blob/master/README.md)

Swipe left or right to clear screen controls


### Import
```
implementation 'com.lmxjw3.widget:clearscreen:1.0.0'
```


### Usage

##### 1. Use ClearScreenLayout in root layout like using FrameLayout.

##### 2. API
```
    // Add slide clear view
    addClearViews(View... views)
    
    // Remove slide clear view
    removeClearViews(View... views)
    
    // Remove all slide clear views
    removeAllClearViews()
    
    // Set slide direction（LEFT or RIGHT）
    setSlideDirection(SlideDirection direction)
    
    // Set slide listener
    setOnSlideListener(OnSlideClearListener slideListener)
```
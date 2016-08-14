# NewsTest

《第一行代码》里面的一个小demo，简单的新闻应用

可在手机和平板上实现不同的显示效果

主要用于练习Fragment的使用

注：在编写过程中发现onAttach(Activity activity)方法已经不推荐使用，改用onAttach(Context context)代替，但该方法在API低于23的版本中无法被调用，可能是bug，故依然使用onAttach(Activity activity)

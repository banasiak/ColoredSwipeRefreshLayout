# ColoredSwipeRefreshLayout

[![](https://jitpack.io/v/banasiak/ColoredSwipeRefreshLayout.svg)](https://jitpack.io/#banasiak/ColoredSwipeRefreshLayout)

Android SwipeRefreshLayout that allows you to set the color scheme via XML.

## Setup

Step 1: Add the JitPack repository to your root build.gradle file
````
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
````

Step 2: Add the dependency
````
dependencies {
    compile 'com.github.banasiak:ColoredSwipeRefreshLayout:0.1'
}
````

## Usage
Use this layout as you would a normal SwipeRefreshLayout from the [Android v4 Support Library](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html).
Set the colors using the `app:animationColorArray` XML attribute.

## Example

#### layout.xml
````    
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    
    <com.banasiak.android.library.csrl.ColoredSwipeRefreshLayout
        android:id="@+id/main_client_swipe_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:animationColorArray="@array/swipe_refresh_colors">

        <FrameLayout
            android:id="@+id/content_to_refresh_goes_here"
            android:layout_width="match_parent"
            android:layout_height="match_parent">

    </com.banasiak.android.library.csrl.ColoredSwipeRefreshLayout>
    
</LinearLayout>
````

#### colors.xml
````
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <integer-array name="swipe_refresh_colors">
        <item>@color/colorPrimary</item>
        <item>@color/colorAccent</item>
    </integer-array>
</resources>
````

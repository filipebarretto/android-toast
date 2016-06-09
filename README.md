# Android Toast

## About

Sample Android application to show a Toast on a button click

### Version
1.1.0

### Table of Contents

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->


- [Getting Started](#getting-started)
  - [Create Android Studio Project](#create-android-studio-project)
  - [Configure Layout File](#configure-layout-file)
  - [Configure Click Events](#configure-click-events)
  - [Create Toast](#create-toast)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->


## Getting Started

Instructions to a sample Android application with Toast

### Create Android Studio Project

To create the Android Studio Project, you can follow the instructions or download the code at https://github.com/filipebarretto/android-hello-world

### Configure Layout File

To configure your activity_main.xml layout file, first replace RelativeLayout with LinearLayout and include a line with two buttons:

```xml
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:weightSum="2">

        <Button
            android:id="@+id/biscoitoButton"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@android:color/holo_green_dark"
            android:textColor="@android:color/white"
            android:text=“Biscoito“ />

        <Button
            android:id="@+id/bolachaButton"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@android:color/holo_red_dark"
            android:textColor="@android:color/white"
            android:text=“Bolacha“ />

    </LinearLayout>
```

### Configure Click Events

On MainActivity.java, first we need to declare the buttons we want to control. Right after the class declaration, declare the buttons:

```java
    private Button mBiscoitoButton;
    private Button mBolachaButton;
```

Then, inside the onCreate method, attach the buttons to the xml elements by their id.

```java
        mBiscoitoButton = (Button) findViewById(R.id.biscoitoButton);
        mBolachaButton = (Button) findViewById(R.id.bolachaButton);
```

Now, set the click events for each button

```java
        mBiscoitoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mBolachaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
```

### Create Toast

Finally, create a Toast inside the click event onClick method for each button, such as:

```java
Toast.makeText(MainActivity.this, “Do globo ao traquinas, é Biscoito!”, Toast.LENGTH_LONG).show();
```

### Run project

To run your project on Android Studio as it was generated, click Run > Run ‘app’, or the play icon on the top bar.
The project ran should look something like:

<p align="center">
<img src="/screenshots/android-toast-1.png" alt="Android Toast" width="256">
<p>

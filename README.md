# MotionShapeOfView

Explain how to use MotionLayout with ShapeOfView

This project is the sample of a medium article : https://medium.com/p/26a7ab10142f

https://github.com/florent37/ShapeOfView

```
dependencies {
    implementation 'com.github.florent37:shapeofview:1.4.4'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.0-alpha2'
}
```

[![screen](https://raw.githubusercontent.com/florent37/Motion-ShapeOfView/master/medias/arc.gif)](https://www.github.com/florent37/Motion-ShapeOfView)

[![screen](https://raw.githubusercontent.com/florent37/Motion-ShapeOfView/master/medias/diagonal.gif)](https://www.github.com/florent37/Motion-ShapeOfView)

# Layout 

https://github.com/florent37/Motion-ShapeOfView/blob/master/app/src/main/res/layout/activity_arc_list.xml

```xml
<androidx.constraintlayout.motion.widget.MotionLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layoutDescription="@xml/collapsing_header_arc"
        app:showPaths="false">

    <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/recyclerView"
            android:layout_width="0dp"
            android:layout_height="0dp"/>

    <com.github.florent37.shapeofview.shapes.ArcView
            android:id="@+id/header"
            android:layout_width="0dp"
            android:layout_height="200dp"
            android:elevation="4dp"
            app:shape_arc_cropDirection="outside"
            app:shape_arc_height="26dp"
            app:shape_arc_position="bottom">

        <androidx.appcompat.widget.AppCompatImageView
                app:srcCompat="@drawable/effeil_tower2"/>

    </com.github.florent37.shapeofview.shapes.ArcView>

    <androidx.appcompat.widget.AppCompatTextView
            android:id="@+id/headerText"
            android:text="I love paris"
            />

</androidx.constraintlayout.motion.widget.MotionLayout>
```

# Motion

https://github.com/florent37/Motion-ShapeOfView/blob/master/app/src/main/res/xml/collapsing_header_arc.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<MotionScene xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <Transition
        app:constraintSetEnd="@id/end"
        app:constraintSetStart="@id/start">

        <OnSwipe
            app:dragDirection="dragUp"
            app:touchAnchorId="@id/recyclerView"
            app:touchAnchorSide="top" />

    </Transition>

    <ConstraintSet android:id="@+id/start">
        <Constraint
            android:id="@id/header"
            android:layout_height="240dp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent">
            <CustomAttribute
                app:attributeName="arcHeightDp"
                app:customFloatValue="60" />
        </Constraint>

        <Constraint
            android:id="@id/headerText"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintBottom_toBottomOf="@+id/header"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="@+id/header">

            <CustomAttribute
                app:attributeName="textSize"
                app:customFloatValue="40" />
        </Constraint>
    </ConstraintSet>

    <ConstraintSet android:id="@+id/end">
        <Constraint
            android:id="@id/header"
            android:layout_height="80dp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent">
            <CustomAttribute
                app:attributeName="arcHeightDp"
                app:customFloatValue="0" />
        </Constraint>
        <Constraint
            android:id="@id/headerText"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginStart="14sp"
            app:layout_constraintBottom_toBottomOf="@+id/header"
            app:layout_constraintStart_toStartOf="@+id/header"
            app:layout_constraintTop_toTopOf="@+id/header">

            <CustomAttribute
                app:attributeName="textSize"
                app:customFloatValue="20" />
        </Constraint>

    </ConstraintSet>

</MotionScene>
```


# Fiches Plateau Moto

Utilisé dans l'application de révisions de permis moto, fiches plateau moto https://www.fiches-plateau-moto.fr/

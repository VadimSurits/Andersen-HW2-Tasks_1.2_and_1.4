package com.example.android.helloconstraint

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var mShowCount: TextView
    private lateinit var zeroButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
        zeroButton = findViewById(R.id.button_zero)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun countUp(view: View) {
        ++mCount
        zeroButton.setBackgroundColor(getColor(R.color.pink))
        when (mCount % 2) {
            0 -> view.setBackgroundColor(Color.GREEN)
            else -> view.setBackgroundColor(Color.BLUE)
        }
        mShowCount.text = mCount.toString()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun zeroFill(view: View) {
        mCount = 0
        zeroButton.setBackgroundColor(getColor(R.color.gray))
        mShowCount.text = mCount.toString()
    }

    //Ответы на вопросы из 10 задания(раздел Homework) Lesson 1.2B

    //Question 1
    //Which two layout constraint attributes on the Zero Button position it vertically equal
    // distance between the other two Button elements? (Pick 2 answers.)
    //Answer:
    //app:layout_constraintBottom_toTopOf="@+id/button_count"
    //app:layout_constraintTop_toBottomOf="@+id/button_toast"

    //Question 2
    //Which layout constraint attribute on the Zero Button positions it horizontally in alignment
    // with the other two Button elements?
    //Answer:
    //app:layout_constraintLeft_toLeftOf="parent"

    //Question 3
    //What is the correct signature for a method used with the android:onClick XML attribute?
    //Answer:
    //public void callMethod(View view)

    //Question 4
    //The click handler for the Count Button starts with the following method signature:
    //public void countUp(View view)
    //Which of the following techniques is more efficient to use within this handler to change
    // the Button element's background color? Choose one:
    //Answer:
    //Use the view parameter that is passed to the click handler with setBackgroundColor(): view.setBackgroundColor()
}
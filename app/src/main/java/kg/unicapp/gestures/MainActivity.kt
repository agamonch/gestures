package kg.unicapp.gestures

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat


private const val DEBUG_TAG = "Gestures"

class MainActivity :
        Activity(),
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private lateinit var mDetector: GestureDetectorCompat


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDetector = GestureDetectorCompat(this, this)

        mDetector.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return if (mDetector.onTouchEvent(event)) {
            true
        } else {
            super.onTouchEvent(event)
        }
    }

    override fun onDown(event: MotionEvent): Boolean {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onDown: $event"
        nameGest.text = "СВАЙП"
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun onFling(
            event1: MotionEvent,
            event2: MotionEvent,
            velocityX: Float,
            velocityY: Float
    ): Boolean {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onDown: $event1, $event2"
        nameGest.text = "Жест OnFLING "
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun onLongPress(event: MotionEvent) {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onlongress: $event"
        nameGest.text = "ДОЛГОЕ НАЖАТИЕ"

    }

    override fun onScroll(
            event1: MotionEvent,
            event2: MotionEvent,
            distanceX: Float,
            distanceY: Float
    ): Boolean {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onlongress: $event1, $event2"
        nameGest.text = "ПРОКРУТКА"
        return true
    }

    override fun onShowPress(event: MotionEvent) {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onDown: $event"
        nameGest.text = "Жест On SHOW PRESS"
    }

    override fun onSingleTapUp(event: MotionEvent): Boolean {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onDown: $event"
        nameGest.text = "Жест On Single TapUp"
        return true
    }

    override fun onDoubleTap(event: MotionEvent): Boolean {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onDown: $event"
        nameGest.text = "Жест On Double Tap"
        return true
    }


    override fun onDoubleTapEvent(event: MotionEvent): Boolean {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onDown: $event"
        nameGest.text = "Жест On Douible Tap Event"
        return true
    }

    override fun onSingleTapConfirmed(event: MotionEvent): Boolean {
        val dataText = findViewById<TextView>(R.id.textView)
        val nameGest = findViewById<TextView>(R.id.textView2)
        dataText.text = "onDown: $event"
        nameGest.text = "Жест on Single Tap Confirmed"
        return true
    }

}
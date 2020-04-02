package com.alexbar10.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scoreTeamA = 0
    var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        three_points_button.setOnClickListener {
            scoreTeamA += 3
            displayForTeamA(scoreTeamA)
        }
        two_points_button.setOnClickListener {
            scoreTeamA += 2
            displayForTeamA(scoreTeamA)
        }
        free_throw_button.setOnClickListener {
            scoreTeamA += 1
            displayForTeamA(scoreTeamA)
        }

        three_points_button_team_b.setOnClickListener {
            scoreTeamB += 3
            displayForTeamB(scoreTeamB)
        }
        two_points_button_team_b.setOnClickListener {
            scoreTeamB += 2
            displayForTeamB(scoreTeamB)
        }
        free_throw_button_team_b.setOnClickListener {
            scoreTeamB += 1
            displayForTeamB(scoreTeamB)
        }
        reset_button.setOnClickListener {
            scoreTeamA = 0
            scoreTeamB = 0
            displayForTeamA(scoreTeamA)
            displayForTeamB(scoreTeamB)
        }

    }

    /**
     * Display score for team A
     */
    private fun displayForTeamA(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_a_score)
        scoreView.text = score.toString()
    }

    /**
     * Display score for team B
     */
    private fun displayForTeamB(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_b_score)
        scoreView.text = score.toString()
    }
}

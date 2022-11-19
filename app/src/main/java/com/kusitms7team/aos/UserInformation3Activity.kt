package com.kusitms7team.aos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class UserInformation3Activity : AppCompatActivity() {

    lateinit var btnBack : ImageButton
    lateinit var btnNext : ImageButton
    lateinit var btnHold : ImageButton
    lateinit var enterSaving : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information3)

        /* 개인정보 수집 페이지 2 정보 받아오기 */
        var nick = intent.getStringExtra("nick")
        var introduction = intent.getStringExtra("introduction")
        var profileImgList = intent.getStringExtra("profileImgList")
        var income = intent.getStringExtra("income")

        enterSaving = findViewById(R.id.enterSaving)

        /* 뒤로가기 버튼 클릭 리스너 */
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        /* 다음 페이지 버튼 클릭 리스너 */
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener{

            val saving = enterSaving.text.toString()

            /* 유저가 항목을 채우지 않았을 경우 */
            if (saving.length == 0) {
                Toast.makeText(this, "한 달 전체 소득을 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, UserInformation4Activity::class.java)
                intent.putExtra("nick", nick)
                intent.putExtra("introduction", introduction)
                intent.putExtra("profileImgList", profileImgList)
                intent.putExtra("income", income)
                intent.putExtra("saving", saving)

                finish()
                startActivity(intent)
            }
        }

        btnHold = findViewById(R.id.btnHold)
        btnHold.setOnClickListener{

            val saving = -1

            val intent = Intent(this, UserInformation4Activity::class.java)
            intent.putExtra("nick", nick)
            intent.putExtra("introduction", introduction)
            intent.putExtra("profileImgList", profileImgList)
            intent.putExtra("income", income)
            intent.putExtra("saving", saving)

            finish()
            startActivity(intent)
        }
    }
}
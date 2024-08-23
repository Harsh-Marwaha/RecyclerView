package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.RecViewAdapter

class MainActivity : AppCompatActivity() {

    var recViewAdapter: RecViewAdapter? = null
    private var arrUserList:ArrayList<ChatModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var     recView : RecyclerView = findViewById(R.id.rvUsers)

        arrUserList.add(ChatModel("Mike Tyson","https://i.redd.it/ecj1r9pt7apb1.jpg"))
        arrUserList.add(ChatModel("Kamal Hasan","https://akm-img-a-in.tosshub.com/indiatoday/images/story/202206/Kamal_Haasan_pushed_to_debt_Vi_0_1200x768.jpeg?VersionId=y8yrdaRffLC8AOA1HrolhfzEKlSJ8HAn&size=690:388"))
        arrUserList.add(ChatModel("Praveen Tambe","https://www.mykhel.com/img/2019/12/pravintambe-1576819675.jpg"))
        arrUserList.add(ChatModel("Guddu Pandit","https://pbs.twimg.com/profile_images/1115513300953862145/hxnz0n2V_400x400.jpg"))
         arrUserList.add(ChatModel("Mike Tyson","https://i.redd.it/ecj1r9pt7apb1.jpg"))
        arrUserList.add(ChatModel("Kamal Hasan","https://akm-img-a-in.tosshub.com/indiatoday/images/story/202206/Kamal_Haasan_pushed_to_debt_Vi_0_1200x768.jpeg?VersionId=y8yrdaRffLC8AOA1HrolhfzEKlSJ8HAn&size=690:388"))
        arrUserList.add(ChatModel("Praveen Tambe","https://www.mykhel.com/img/2019/12/pravintambe-1576819675.jpg"))
        arrUserList.add(ChatModel("Guddu Pandit","https://pbs.twimg.com/profile_images/1115513300953862145/hxnz0n2V_400x400.jpg"))
         arrUserList.add(ChatModel("Mike Tyson","https://i.redd.it/ecj1r9pt7apb1.jpg"))
        arrUserList.add(ChatModel("Kamal Hasan","https://akm-img-a-in.tosshub.com/indiatoday/images/story/202206/Kamal_Haasan_pushed_to_debt_Vi_0_1200x768.jpeg?VersionId=y8yrdaRffLC8AOA1HrolhfzEKlSJ8HAn&size=690:388"))
        arrUserList.add(ChatModel("Praveen Tambe","https://www.mykhel.com/img/2019/12/pravintambe-1576819675.jpg"))
        arrUserList.add(ChatModel("Guddu Pandit","https://pbs.twimg.com/profile_images/1115513300953862145/hxnz0n2V_400x400.jpg"))
         arrUserList.add(ChatModel("Mike Tyson","https://i.redd.it/ecj1r9pt7apb1.jpg"))
        arrUserList.add(ChatModel("Kamal Hasan","https://akm-img-a-in.tosshub.com/indiatoday/images/story/202206/Kamal_Haasan_pushed_to_debt_Vi_0_1200x768.jpeg?VersionId=y8yrdaRffLC8AOA1HrolhfzEKlSJ8HAn&size=690:388"))
        arrUserList.add(ChatModel("Praveen Tambe","https://www.mykhel.com/img/2019/12/pravintambe-1576819675.jpg"))
        arrUserList.add(ChatModel("Guddu Pandit","https://pbs.twimg.com/profile_images/1115513300953862145/hxnz0n2V_400x400.jpg"))
         arrUserList.add(ChatModel("Mike Tyson","https://i.redd.it/ecj1r9pt7apb1.jpg"))
        arrUserList.add(ChatModel("Kamal Hasan","https://akm-img-a-in.tosshub.com/indiatoday/images/story/202206/Kamal_Haasan_pushed_to_debt_Vi_0_1200x768.jpeg?VersionId=y8yrdaRffLC8AOA1HrolhfzEKlSJ8HAn&size=690:388"))
        arrUserList.add(ChatModel("Praveen Tambe","https://www.mykhel.com/img/2019/12/pravintambe-1576819675.jpg"))
        arrUserList.add(ChatModel("Guddu Pandit","https://pbs.twimg.com/profile_images/1115513300953862145/hxnz0n2V_400x400.jpg"))
         arrUserList.add(ChatModel("Mike Tyson","https://i.redd.it/ecj1r9pt7apb1.jpg"))
        arrUserList.add(ChatModel("Kamal Hasan","https://akm-img-a-in.tosshub.com/indiatoday/images/story/202206/Kamal_Haasan_pushed_to_debt_Vi_0_1200x768.jpeg?VersionId=y8yrdaRffLC8AOA1HrolhfzEKlSJ8HAn&size=690:388"))
        arrUserList.add(ChatModel("Praveen Tambe","https://www.mykhel.com/img/2019/12/pravintambe-1576819675.jpg"))
        arrUserList.add(ChatModel("Guddu Pandit","https://pbs.twimg.com/profile_images/1115513300953862145/hxnz0n2V_400x400.jpg"))


        recView.layoutManager = LinearLayoutManager(this@MainActivity)
        recViewAdapter = RecViewAdapter(this@MainActivity,arrUserList)
        recView.adapter = recViewAdapter


    }
}
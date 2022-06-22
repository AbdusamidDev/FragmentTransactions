package developer.abdusamid.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import developer.abdusamid.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val add = "Added"
    private val remove = "Remove"
    private val replaced = "Replace"
    private val hide = "Hide"
    private val show = "Show"
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val blankFragment = BlankFragment()
        val blankFragment2 = BlankFragment2()

        binding.apply {

            btnAdd.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
//                val blankFragment = BlankFragment()
                transaction.add(R.id.my_container, blankFragment)
                transaction.commit()
                Toast.makeText(this@MainActivity, add, Toast.LENGTH_SHORT).show()
            }

            btnRemove.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
//                val blankFragment = BlankFragment()
//                val blankFragment2 = BlankFragment2()
                transaction.remove(blankFragment)
                transaction.remove(blankFragment2)
                transaction.addToBackStack(fragmentManager.toString())
                transaction.commit()
                Toast.makeText(this@MainActivity, remove, Toast.LENGTH_SHORT).show()

            }

            btnReplace.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
//                val blankFragment2 = BlankFragment2()
                transaction.replace(R.id.my_container, blankFragment2)
                transaction.commit()
                Toast.makeText(this@MainActivity, replaced, Toast.LENGTH_SHORT)
                    .show()

            }
            btnHide.setOnClickListener {
                val fragmentManager = supportFragmentManager
//                val blankFragment = BlankFragment()
//                val blankFragment2 = BlankFragment2()
                val transaction = fragmentManager.beginTransaction()
                transaction.hide(blankFragment)
                transaction.hide(blankFragment2)
                Toast.makeText(this@MainActivity, hide, Toast.LENGTH_SHORT).show()

                transaction.commit()
            }

            btnShow.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                //val blankFragment = BlankFragment()
                //val blankFragment2 = BlankFragment2()
                Toast.makeText(this@MainActivity, show, Toast.LENGTH_SHORT).show()
                transaction.show(blankFragment)
                transaction.show(blankFragment2)
                transaction.commit()
            }

        }
    }
}
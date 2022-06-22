package developer.abdusamid.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import developer.abdusamid.fragment.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    var click = "Fragment2 Clicked"
    lateinit var binding: FragmentBlank2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlank2Binding.inflate(layoutInflater)
        binding.btnClick.setOnClickListener {
            Toast.makeText(context, click, Toast.LENGTH_SHORT).show()
        }

        return binding.root

    }
}
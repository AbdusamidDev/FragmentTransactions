package developer.abdusamid.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import developer.abdusamid.fragment.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    var click = "Fragment Click"
    lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(layoutInflater)

        binding.btn1.setOnClickListener {
            Toast.makeText(binding.root.context, click, Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}
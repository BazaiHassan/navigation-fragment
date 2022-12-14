package ir.esen.navfragproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation


class MainFragment : Fragment(), View.OnClickListener {

    var navController :NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_login_main).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_register_main).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.btn_login_main -> navController!!.navigate(R.id.action_mainFragment_to_loginFragment)
            R.id.btn_register_main -> navController!!.navigate(R.id.action_mainFragment_to_registerFragment)
        }
    }

}
package org.codeforegypt.quickassestant.ui

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.ktx.messaging
import dagger.hilt.android.AndroidEntryPoint
import org.codeforegypt.quickassestant.R
import org.codeforegypt.quickassestant.databinding.ActivityMainBinding
import org.codeforegypt.quickassestant.other.Constants.USER_DATABASE_NAME
import java.io.File


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
    ) { isGranted: Boolean ->
        if (isGranted) {
            // FCM SDK (and your app) can post notifications.
        } else {
            // TODO: Inform user that that your app will not show notifications.
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navHostFragment = supportFragmentManager.findFragmentById(binding.hostFragment.id) as NavHostFragment
        navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)

        askNotificationPermission()
        subscribeToEmergencyTopic()

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment
        navHostFragment.navController.addOnDestinationChangedListener{_ , destination , _ ->

            when(destination.id){
                R.id.mainFragment, R.id.emergencyFragment, R.id.contactsFragment2, R.id.moreFragment2, R.id.articlesFragment -> {
                    binding.bottomNavigationView.visibility = View.VISIBLE
                } else -> {
                    binding.bottomNavigationView.visibility = View.GONE
                }
            }
        }

    }

   /* fun deleteDatabaseFile() {
        val databases = File(this.applicationInfo.dataDir + USER_DATABASE_NAME)
        val db = File(databases, USER_DATABASE_NAME)
        if (db.delete()) Log.d("RoomBDO", "Database deleted") else Log.d(
            "RoomBDO",
            "Failed to delete database"
        )
        val journal = File(databases, USER_DATABASE_NAME + "-journal")
        if (journal.exists()) {
            if (journal.delete()) Log.d("RoomBDO", "Database journal deleted") else Log.d(
                "RoomBDO",
                "Failed to delete database journal"
            )
        }
    }*/


    private fun subscribeToEmergencyTopic() {
        Firebase.messaging.subscribeToTopic("EmergencyAlert")
            .addOnCompleteListener { task ->
                var msg = "Subscribed"
                if (!task.isSuccessful) {
                    msg = "Subscribe failed"
                }
                Log.d("EmergencyNotification", "Topic: $msg")
            }
    }


    private fun askNotificationPermission() {
        // This is only necessary for API level >= 33 (TIRAMISU)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) ==
                PackageManager.PERMISSION_GRANTED
            ) {
                // FCM SDK (and your app) can post notifications.
            } else if (shouldShowRequestPermissionRationale(Manifest.permission.POST_NOTIFICATIONS)) {
                // TODO: display an educational UI explaining to the user the features that will be enabled
                //       by them granting the POST_NOTIFICATION permission. This UI should provide the user
                //       "OK" and "No thanks" buttons. If the user selects "OK," directly request the permission.
                //       If the user selects "No thanks," allow the user to continue without notifications.
            } else {
                // Directly ask for the permission
                requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            }
        }
    }
}
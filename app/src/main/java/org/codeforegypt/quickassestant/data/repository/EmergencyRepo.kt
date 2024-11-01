package org.codeforegypt.quickassestant.data.repository

import android.util.Log
import org.codeforegypt.quickassestant.api.EmergencyApi
import org.codeforegypt.quickassestant.data.db.UserDao
import org.codeforegypt.quickassestant.data.model.Emergency
import org.codeforegypt.quickassestant.data.model.ModifyEmergency
import org.codeforegypt.quickassestant.domain.repository.IEmergencyRepo
import javax.inject.Inject

class EmergencyRepo @Inject constructor (
    private val emergencyApi: EmergencyApi,
    private val user: UserDao
): IEmergencyRepo {
    override suspend fun addEmergency(report: ModifyEmergency): Boolean {
        return try {
            val email = user.getUser().email
            val update = report.copy(email = email)
            val response = emergencyApi.addEmergency(
                update.email,
                update.latitude,
                update.longitude,
                update.message
            ).await()
            if (response.isSuccessful)
                emergencyApi.sendNotification(email).await()
            response.isSuccessful
        } catch (e: Exception) {
            false
        }
    }


    override suspend fun getMyEmergencies(): List<Emergency>? {
        return try {
            val email = user.getUser().email
            val response = emergencyApi.getMyEmergency(
                email
            ).await()
            if (response.isSuccessful && response.body() != null) {
                response.body()!!.report
            } else {
                emptyList()
            }
        } catch (e: Exception) {
            null
        }
    }

    override suspend fun getEmergency(): List<Emergency>? {
        return try {
            val phone = user.getUser().phone
            val response = emergencyApi.getEmergencies(
                phone
            ).await()
            return if (response.isSuccessful && response.body() != null) {
                response.body()!!.report
            } else {
                emptyList()
            }
        } catch (e: Exception) {
            null
        }
    }

}
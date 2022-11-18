package com.elementarno.lab

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FirebasePushService: FirebaseMessagingService() {
    override fun onNewToken(token: String) = Unit

    override fun onMessageReceived(message: RemoteMessage) = Unit
}
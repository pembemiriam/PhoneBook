package com.pembe.angular.models;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC0e9ad9997e2269ac844df8adca93f455";
    public static final String AUTH_TOKEN =
            "188c3b63a52fea0e875487984cfc1a3e";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+237 6 71 84 06 46"), // to
                        new PhoneNumber("+18065135654"), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}
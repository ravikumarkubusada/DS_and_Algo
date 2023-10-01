package com.mph.notificationservice;

public class SQL_Main {
    public static void main(String[] args) {
        String query = "INSERT INTO Members_100_2 (PATIENT_ID, FIRST_NAME, LAST_NAME, EMAIL, SSN, created_on, org_id, AFFILIATE_ID) " +
                "VALUES ('%s', 'MS%s', 'Dhoni%s', 'msd%s@mph.com', '%s', CURRENT_TIMESTAMP,1,2);";
        for(int i=1; i<=1000;i++) {
            System.out.println(String.format(query,i,i,i,i,11111111+i));
        }
    }
}

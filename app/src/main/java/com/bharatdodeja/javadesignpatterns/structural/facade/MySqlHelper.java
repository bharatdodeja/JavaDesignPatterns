package com.bharatdodeja.javadesignpatterns.structural.facade;

import java.sql.Connection;

/**
 * Created by bharat.dodeja on 12/1/2016.
 */

class MySqlHelper {
    static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }

    void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
}

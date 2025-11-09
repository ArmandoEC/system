package com.armandodev.util;

import org.flywaydb.core.Flyway;

public class FlywayMigration {

    public static void migrate() {        
        
        Flyway flyway = null;
        
        try {
            
            flyway = Flyway.configure()
                    .dataSource("jdbc:sqlserver://LOCALHOST\\sqlexpress:1433;databaseName=system;ApplicationName=SYSTEM", "sa", "javadeveloper")
                    .locations("classpath:db/migration")
                    .baselineOnMigrate(true)
                    .load();

            flyway.migrate();
            
        } catch (Exception e) {
            flyway.repair();
            e.printStackTrace();
        }
        
    }
    
}

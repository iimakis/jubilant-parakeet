package com.iimakis.ticketsystem.util;

import org.hibernate.cfg.ImprovedNamingStrategy;

public class CustomNamingStrategy extends ImprovedNamingStrategy {
	
    @Override
    public String classToTableName(String className) {
        String tableNameInSingularForm = super.classToTableName(className);
        return transformToPluralForm(tableNameInSingularForm);
    }
 
    private String transformToPluralForm(String tableNameInSingularForm) {
        StringBuilder pluralForm = new StringBuilder();
 
        pluralForm.append(tableNameInSingularForm);
        if (tableNameInSingularForm.charAt(tableNameInSingularForm.length() -1) == 'y') {
        	pluralForm.deleteCharAt(pluralForm.length() -1);
        	pluralForm.append("ies");
        }
        else if (tableNameInSingularForm.charAt(tableNameInSingularForm.length() -1) == 's'
        		|| tableNameInSingularForm.charAt(tableNameInSingularForm.length() -1) == 'x') {
        	pluralForm.append("es");
        }
        else {
        	pluralForm.append("s");
        }
 
        return pluralForm.toString();
    }
}
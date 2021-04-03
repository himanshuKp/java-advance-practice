/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/04/21, 10:58 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.locale;

import java.util.Locale;

public class LocaleMethods {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        System.out.println("Country: "+defaultLocale.getDisplayCountry());
        System.out.println("Name: "+defaultLocale.getDisplayName());
        System.out.println("Language: "+defaultLocale.getDisplayLanguage());
        System.out.println("Script: "+defaultLocale.getDisplayScript());

        String[] isoCountries = Locale.getISOCountries();
        for (String isoCountry : isoCountries) {
            System.out.println(isoCountry);
        }

        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage);
        }

        Locale.setDefault(Locale.FRANCE);
        System.out.println("Updated country: "+Locale.getDefault().getDisplayCountry());
    }
}

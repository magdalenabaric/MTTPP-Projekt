# MTTPP-Projekt

Projekt je izrađen korištenjem programskog jezika Java unutar IntelliJ IDEA programa. Testiran je pristup te neke funkcionalnosti stranice Parfemi Milano.
Izvedeno je 8 testnih slučajeva, a svaki od njih izveden je duplo(korištenjem cross browser testiranja), na Google Chromu korištenjem chrome drivera te na Microsoft Edge-u korištenjem msedge drivera. 

U prvom testnom slučaju ispitano je hoće li se za unos teksta "parfemi milano" kao prvi rezultat prikazati stranica s nazivom Parfemi Milano, tj. ciljana stranica.

Drugim testnim slučajem ispituje se hoće li se istim unosom u tražilicu "parfemi milano" tekst, tj. poveznica prikazana na vrhu prvog elementa pokazati ispravna za promatranu stranicu.

Trećim testnim slučajem ispitano je hoće li se pretprikazani naslov stranice na prvom rezultatu poklapati sa zadanim "Parfemi Milano".

Četvrtim testnim slučajem ispituje se hoće li prvi naslov na otvorenoj naslovnoj stranici, koji je pronađen pomoći id-a biti jednak očekivanom koji je "AKCIJA".

U petom testnom slučaju pronalazi se naslovna naslovnoj stranici "Zašto ljudi vole naše parfeme" pomoću id-a elementa.

U šestom testnom slučaju prilikom pretraživanja pronalazi se link koji sadrži riječ "milano" te se otvara što potvrđuje je li otvaranje stranice uspjelo.

Sedmi testni slučaj testira dodavanje proizvoda u košaricu, prvo se otvara stranica, zatim se odlazi na SHOP, odabire se zadani parfem te pritiskom na tipku dodaje u košaricu.

Osmi testni slučaj je proširen 7 slučaj u kojem se nakon dodanog proizvoda u košaricu prikazuje mogućnost pregleda košarice te se pritiskom na taj gumb testira pregledavanje sadržaja košarice.

Na kraju napravljena je i testNG.xml datoteka kojom se pokreće prvi testni slučaj temeljen na chrome driveru. 

Oznaka TestClassN označava testne slučajeve za Google Chrome, dok oznaka TestClassN_ME označava testni slučaj za Microsoft Edge.
Za izradu bili su potrebni IntelliJ IDEA, chromedriver, msedgedriver, java JDK, Selenium, a sve je izgrađeno kao Maven projekt. 

FELADAT:

Egy találóskérdést kell leprogramozni. A programozási munkába minél több mindent kell bemutatni arra vonatkozóan, hogy miket tanultál a 2. félév során. Ezek a szempontok:
OOP szemlélet (javaslom max 3 osztály használatát)
Tervezési lépések, pl UML, esetleg pszeudókód v foylamatábra
public/private/static/final/enum megfelelő használata
GitHub (commit, gitignore, readme)
program szétbontása package-ekre
GUI készítés, kép használattal
Tiszta kód elvei
Tesztkód írása (1 fontos metódusnak 1 fontos tesztesete)
3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat (ami nem változtatható, mert belevésték a ládába), de csak az egyik láda állítása igaz! 
arany: én rejtem a kincset
ezüst: nem én rejtem a kincset
bronz: az arany hazudik
Indokold (readme fájlban a megoldás logikájának alátámasztása, pl táblázatos formában), hogy szerinted miért ott a kincs! Ez alapján „helyezd el” a kincset a megfelelő ládába.







Megoldás:
Ha a Játék szerint 1 olyan láda van amelyik igazat mond akkor ezesetben, vegyük át ládánként a kiírásokat

arany: én rejtem a kincset
ezüst: nem én rejtem a kincset
bronz: az arany hazudik

Ha az arany láda kijelentése igaz, akkor benne kell lennie a kincsnek. Viszont ezzel az ezüst is igazat mondott tehát a szabálynak nem felel meg.

Ha az ezüst láda kijelentése igaz, akkor az arany hazudott, ezzel igazzá téve bronz kijelentését is. Tehát 2 igaz megint nem felel meg

Ha a bronz láda kijelentése igaz, akkor az arany hazudott, nincs benne a kincs, és az ezüst is, tehát ezzel BENNE TALÁLJUK MEG A KINCSET.

Mivel a feladat nem azt mondja hogy az igaz állítással rendelkező ládában van a kincs, ezért az ezüst láda tartalmazza a kincset.
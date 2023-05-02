# kotlin-workshop-sample
a sample repository for exercise and samples in kotlin

## First Exercise

- Create a new branch "square" and switch to it
- add a new method "square" in the Calculator class (with TODO() as body)
- stage the change and commit it
- checkout the main-branch and create a method "absolute" in the branch (with TODO() as body)
- stage the change and commit it
- checkout the square branch, rebase it to he main-branch
- merge the square-bracnh into the master

## Second Exercise

- create a branch "test" and switch to it
- implement the tests
- run the tests with gradle
- merge into master

## Booking Übung

Schreibe eine Kotlin-Funktion, die eine Liste von Buchungen (Booking) als Parameter erhält und folgende Informationen aggregiert und zurückgibt:

- Gesamtumsatz
- Anzahl der Buchungen
- Durchschnittlicher Umsatz pro Buchung
- Anzahl der Buchungen pro Kategorie (category)
- Gesamtumsatz pro Kategorie

Modelliere eine geeignete Klasse für die Buchung (Data Class).
Verwalte die Buchungskategorie als Enum!

Schreibe geeignete Tests!

Hinweis: Du kannst Funktionen wie filter, groupBy, sumByDouble und map verwenden, um diese Aufgabe zu lösen.



### Beispielausgabe:

- Total revenue: 1675.0
- Number of bookings: 6
- Average revenue per booking: 279.1666666666667
- Number of bookings per category: {Food=3, Travel=2, Entertainment=1}
- Revenue per category: {Food=350.0, Travel=1150.0, Entertainment=75.0}


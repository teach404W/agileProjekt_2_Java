# Kapitelübersicht

1. Beschreibung der Anwendung
2. Beschreibung der Funktionen
   1. mind. 4 Methoden abläufe gerne mithilfe von Diagrammen (PAP, Struktogramm, Sequenzdiagramm, Anwendungsfalldiagramm, Aktivitätdiagramm )
3. Diagramme - Dokumentation
   1. Objektdiagramm
   2. Klassendiagramm
   3. Methoden aus 2.
      1. Sequenzdiagramm
      2. (optional) PAP, Struktogramm

## 1. Beschreibung der Anwendung

### Grobbeschreibung 
Wir implementieren eine Notenverwaltng für Schüler. In dieser Anwendung sollen Nutzer ihre Fächer (inkl. unterschiedlicher Jahre) verwalten können. Dabei sollen neben der Noten auch der zugehörige Fachlehrer und das jahr gespeichert werden. 

### Menüführung
Die Menüfuhrung ist rein Textutell. Beim Start der Anwendung gibt es eine Psswortabfrage und danach kann der Nutzer wählen zwischen:
- Fach anlegen
- Note für Fach eintragen
  - (erst Auswahl für ein Fach und Jahr, dann eintragen)
- Note für Fach anzeigen

## 2. Beschreibung der Funktion

### 1. Beschreibung Funktion Fach anlegen
Nach der Anmeldung wählt der Benutzer die Option Fach anwählen danach wird er nach einen Namen und einem Jahr gefragt, welche er über die Konsole eingibt.
Sofern es das Fach mit dem Namen und Jahr schon gibt wird die Methode abgebrochen und es erscheint eine Ausgabe, die den Nutzern auf den Fehler bei der Eingabe hinweist.

#### 1. Digramm Funktion Fach anlegen

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/agileProjekt_2_Java/main/Docs/Diagramme/AnwendungsFall_Fach_anlegen.iuml)


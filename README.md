# Group_12


## INTERFACCIA DI GIOCO
- Sulla sinistra troviamo la tessera e lo slot della libreria che abbiamo selezionato e i bottoni per:
  -  Aggiungere la tessera selezionata allo slot selezionato;
  -  Passare al prossimo turno (prossimo giocatore);
  -  Terminare la partita (a qualsiasi punto del gioco);

- In basso abbiamo gli obiettivi comuni:
  -  Il primo (a sinistra) una volta completato darà 10 punti;
  -  Il secondo (a destra) una volta completato darà 5 punti;

- Al centro si trova la board principale, il numero di tessere presenti dipende dal numero di giocatori;

- A destra troviamo:
  - In alto l'obiettivo personale (generato randomicamente) che dà n punti per n tessere posizionate nel posto giusto ;
  - In basso la libreria del giocatore corrente;
  - Tra i due troviamo il giocatore e il turno corrente;

----------------------------------

## GAME FLOW

1. Cliccare sul bottone "INIZIA PARTITA";
2. Selezionare n° di giocatori desiderato; 
3. Impostare il nome di essi (opzionale);
4. Cliccare sul bottone "CONFERMA";
5. A questo punto inizierà il primo turno del Giocatore 1;
6. Selezionare la tessera desiderata dalla board (Una label sul pannello di sinistra e la luminosità della tessera indicheranno se può essere prelevata);
7. Selezionare dalla libreria la cella dove si vuole collocare la tessera, anche in questo caso una label e l'attivazione del bottone "AGGIUNGI ALLA TUA LIBRERIA" indicheranno se è possibile posizionarla in quel determiato slot;
8. E' possibile ripetere l'operazione per 3 tessere poi sarà obbligatorio passare al prossimo turno, in cui compariranno l'obiettivo personale e la libreria dell'altro giocatore;
9. Una volta che vogliamo che il gioco finisca e che ci vengano conteggiati i punti clicchiamo sul bottone "FINE PARTITA";

-----------------------------------

## CRITICITA'

Le seguenti cose non sono state fixate per dare priorità al funzionamento delle logiche del gioco, a causa del poco tempo rimasto:
1. Cliccando due volte sulle tessere viene mostrato l'rgb del colore della tessera;
2. La libreria del primo player non illumina correttamente gli slot disponibili; 
3. Le tessere nella board non vengono rigenerate una volta terminate.

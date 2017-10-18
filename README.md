#Esercizio per gli studenti di INGSW 2017
- spostarsi su un nuovo branch chiamandolo "test/athleticGame"
- creatre due classi di test per AthleticGame:
	1. AthleticGameBasicTest (già presente nel progetto):
		- aggiungere un test per testare il metodo addArrival(String participant, Instant arrival). In questo test verificare che, aggiungendo un nuovo arrivo, la taglia della mappa arrivals diventi pari ad 1
		- aggiungere un test per verificare che getParecipiantTime(String participant) lanci un'eccezione in caso di partecipante non valido 
	2. AthleticGameWinnersTest:
		- utilizzare @BeforeClass per istanziare un campo privato statico di tipo AthleticGame su cui effettuare i test
		- utilizzare @After per richiamare il metodo reset()
		- utilizzare @Before per richiamare il metodo start()
		- aggiungere due metodi di test per la funzione getWinner (scegliere i test in modo significativo, ma a piacere)
		
	3. AthleticGameTestSuite: 
		- raggruppare le due classi di test in una TestSuite (vedi slides) ed eseguire la suite per verificarne il corretto funzionamento
	
- committare e pushare il branch "test/athleticGame"
- spostarsi sul branch master ed effettuare il merge di "test/athleticGame" sul master
- committare e pushare il branch master
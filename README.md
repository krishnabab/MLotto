# MLotto - Musical Thambola game with music tracks in bingo tickets

Users: 
1. Download MLotto-0.0.1-SNAPSHOT.jar from GIT 
3. and run app like below
java -jar -DsongsFolderPath=<SongsFolderPath> MLotto-0.0.1-SNAPSHOT.jar

Example : 
java -jar -DsongsFolderPath=/Volumes/HD2/Krishna_Docs/Music MLotto-0.0.1-SNAPSHOT.jar
4. Make sure you give a full path to songsfolder and it contains 20 to 100 songs.
5. Then launch browser url http://localhost:9080/index.html
6. Provide number of tickets and generate and print

Developers :

1.Access webpage by running url http://localhost:9080/index.html on browser 
2./MLotto/src/main/resources/application.properties update this file property songsFolderPath to the filesystem path where songs located
3. Provide numeric value for the Enter Number of Tickets Ex : 10 
4. Generate tickets button will generate tickets
5. Print tickets will print them for you. 

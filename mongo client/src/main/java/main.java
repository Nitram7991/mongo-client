
import com.mongodb.client.*;



public class main {


    MongoClient mongoClient = MongoClients.create(); //connection mongoDB en local
    MongoDatabase database = mongoClient.getDatabase("DataBase1"); //selection de la base de donnée Database 1
    MongoCollection collection1 = database.getCollection("Collection1"); //selection de la collection1

}

package com.mthree.firstsummativeassessments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kavin Kullama
 */
public class DogGenetics {
    public static void main(String[] args){
        System.out.println("What is your dog's name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        getGeneticsResult(name);
    }
    
    // Function for displaying results of dog genetics.
    
    public static void getGeneticsResult(String dogName){
        
        // Yes, this is my full intention of using every possible dog breed in existence.
        // Except for those that contains non-ASCII characters.
        String[] dogBreeds = { "Affenpinscher", "Afghan Hound", "Africanis", "Aidi", "Airedale Terrier", "Akbash", "Akita", "Aksaray Malaklisi", "Alapaha Blue Blood Bulldog", "Alaskan husky", "Alaskan Klee Kai", "Alaskan Malamute", "Alopekis", "Alpine Dachsbracke", "American Bulldog", "American Bully", "American Cocker Spaniel", "American English Coonhound", "American Eskimo Dog", "American Foxhound", "American Hairless Terrier", "American Pit Bull Terrier", "American Staffordshire Terrier", "American Water Spaniel", "Andalusian Hound", "Appenzeller Sennenhund", "Ariegeois", "Armant", "Armenian Gampr dog", "Artois Hound", "Australian Cattle Dog", "Australian Kelpie", "Australian Shepherd", "Australian Stumpy Tail Cattle Dog", "Australian Terrier", "Austrian Black and Tan Hound", "Austrian Pinscher", "Azawakh", "Bakharwal dog", "Banjara Hound", "Barbado da Terceira", "Barbet", "Basenji", "Basque Shepherd Dog", "Basset Bleu de Gascogne", "Basset Fauve de Bretagne", "Basset Hound", "Bavarian Mountain Hound", "Beagle", "Beagle-Harrier", "Belgian Shepherd", "Bearded Collie", "Beauceron", "Bedlington Terrier", "Bergamasco Shepherd", "Berger Picard", "Bernese Mountain Dog", "Bichon Frisé", "Billy", "Black and Tan Coonhound", "Black Norwegian Elkhound", "Black Russian Terrier", "Black Mouth Cur", "Bloodhound", "Blue Lacy", "Blue Picardy Spaniel", "Bluetick Coonhound", "Boerboel", "Bohemian Shepherd", "Bolognese", "Border Collie", "Border Terrier", "Borzoi", "Bosnian Coarse-haired Hound", "Boston Terrier", "Bouvier des Ardennes", "Bouvier des Flandres", "Boxer", "Boykin Spaniel", "Bracco Italiano", "Braque d'Auvergne", "Braque du Bourbonnais", "Braque Francais", "Braque Saint-Germain", "Briard", "Brittany", "Broholmer", "Bruno Jura Hound", "Brussels Griffon", "Bucovina Shepherd Dog", "Bull Arab", "Bull Terrier", "Bulldog", "Bullmastiff", "Bully Kutta", "Burgos Pointer", "Cairn Terrier", "Campeiro Bulldog", "Can de Chira", "Can de Palleiro", "Canaan Dog", "Canadian Eskimo Dog", "Cane Corso", "Cane di Oropa", "Cane Paratore", "Cantabrian Water Dog", "Cardigan Welsh Corgi", "Carea Castellano Manchego", "Carolina Dog", "Carpathian Shepherd Dog", "Catahoula Leopard Dog", "Catalan Sheepdog", "Caucasian Shepherd Dog", "Cavalier King Charles Spaniel", "Central Asian Shepherd Dog", "Cesky Fousek", "Cesky Terrier", "Chesapeake Bay Retriever", "Chihuahua", "Chilean Terrier", "Chinese Crested Dog", "Chinook", "Chippiparai", "Chongqing dog", "Chortai", "Chow Chow", "Cirneco dell'Etna", "Clumber Spaniel", "Colombian fino hound", "Coton de Tulear", "Cretan Hound", "Croatian Sheepdog", "Curly-Coated Retriever", "Cursinu", "Czechoslovakian Wolfdog", "Dachshund", "Dalmatian", "Dandie Dinmont Terrier", "Danish Spitz", "Danish-Swedish Farmdog", "Denmark Feist", "Dobermann", "Dogo Argentino", "Dogo Guatemalteco", "Dogo Sardesco", "Dogue Brasileiro", "Dogue de Bordeaux", "Drentse Patrijshond", "Drever", "Dunker", "Dutch Shepherd", "Dutch Smoushond", "East Siberian Laika", "East European Shepherd", "Ecuadorian Hairless Dog", "English Cocker Spaniel", "English Foxhound", "English Mastiff", "English Setter", "English Shepherd", "English Springer Spaniel", "Entlebucher Mountain Dog", "Estonian Hound", "Estrela Mountain Dog", "Eurasier", "Field Spaniel", "Fila Brasileiro", "Finnish Hound", "Finnish Lapphund", "Finnish Spitz", "Flat-Coated Retriever", "French Bulldog", "French Spaniel", "Garafian Shepherd", "Gascon Saintongeois", "Georgian Shepherd", "German Hound", "German Longhaired Pointer", "German Pinscher", "German Roughhaired Pointer", "German Shepherd Dog", "German Shorthaired Pointer", "German Spaniel", "German Spitz", "German Wirehaired Pointer", "Giant Schnauzer", "Glen of Imaal Terrier", "Golden Retriever", "Gordon Setter", "Grand Bleu de Gascogne", "Great Dane", "Greater Swiss Mountain Dog", "Greek Harehound", "Greek Shepherd", "Greenland Dog", "Greyhound", "Griffon Bleu de Gascogne", "Griffon Fauve de Bretagne", "Griffon Nivernais", "Gull Dong", "Gull Terrier", "Halden Hound", "Hanover Hound", "Harrier", "Havanese", "Himalayan Sheepdog", "Hierran Wolfdog", "Hokkaido", "Hovawart", "Huntaway", "Hygen Hound", "Ibizan Hound", "Icelandic Sheepdog", "Indian pariah dog", "Indian Spitz", "Irish Red and White Setter", "Irish Setter", "Irish Terrier", "Irish Water Spaniel", "Irish Wolfhound", "Istrian Coarse-haired Hound", "Istrian Shorthaired Hound", "Italian Greyhound", "Jack Russell Terrier", "Jagdterrier", "Japanese Chin", "Japanese Spitz", "Japanese Terrier", "Jindo", "Jonangi", "Kai Ken", "Kaikadi", "Kangal Shepherd Dog", "Kanni", "Karakachan dog", "Karelian Bear Dog", "Kars", "Karst Shepherd", "Keeshond", "Kerry Beagle", "Kerry Blue Terrier", "Khala", "King Charles Spaniel", "King Shepherd", "Kintamani", "Kishu", "Kokoni", "Kombai", "Komondor", "Kooikerhondje", "Koolie", "Koyun dog", "Kuchi", "Kuvasz", "Labrador Retriever", "Lagotto Romagnolo", "Lakeland Terrier", "Lancashire Heeler", "Landseer", "Lapponian Herder", "Leonberger", "Levriero Sardo", "Lhasa Apso", "Lithuanian Hound", "Lupo Italiano", "Mackenzie River husky", "Mahratta Greyhound", "Maltese", "Manchester Terrier", "Maremmano-Abruzzese Sheepdog", "McNab dog", "Miniature American Shepherd", "Miniature Bull Terrier", "Miniature Fox Terrier", "Miniature Pinscher", "Miniature Schnauzer", "Molossus of Epirus", "Montenegrin Mountain Hound", "Mountain Cur", "Mountain Feist", "Mucuchies", "Mudhol Hound", "Mudi", "Neapolitan Mastiff", "New Guinea singing dog", "New Zealand Heading Dog", "Newfoundland", "Norfolk Terrier", "Norrbottenspets", "Northern Inuit Dog", "Norwegian Buhund", "Norwegian Elkhound", "Norwegian Lundehund", "Norwich Terrier", "Nova Scotia Duck Tolling Retriever", "Old Croatian Sighthound", "Old Danish Pointer", "Old English Sheepdog", "Old English Terrier", "Olde English Bulldogge", "Otterhound", "Pachon Navarro", "Pampas Deerhound", "Paisley Terrier", "Papillon", "Parson Russell Terrier", "Pastore della Lessinia e del Lagorai", "Patagonian Sheepdog", "Patterdale Terrier", "Pekingese", "Pembroke Welsh Corgi", "Perro Majorero", "Perro de Pastor Mallorquin", "Perro de Presa Canario", "Perro de Presa Mallorquin", "Peruvian Inca Orchid", "Petit Bleu de Gascogne", "Pharaoh Hound", "Phu Quoc Ridgeback", "Picardy Spaniel", "Plummer Terrier", "Plott Hound", "Podenco Canario", "Podenco Valenciano", "Pointer", "Poitevin", "Polish Greyhound", "Polish Hound", "Polish Lowland Sheepdog", "Polish Tatra Sheepdog", "Pomeranian", "Pont-Audemer Spaniel", "Poodle", "Porcelaine", "Portuguese Podengo", "Portuguese Pointer", "Portuguese Water Dog", "Posavac Hound", "Pshdar dog", "Pudelpointer", "Pug", "Puli", "Pumi", "Pungsan dog", "Pyrenean Mastiff", "Pyrenean Mountain Dog", "Pyrenean Sheepdog", "Rafeiro do Alentejo", "Rajapalayam", "Rampur Greyhound", "Rat Terrier", "Ratonero Bodeguero Andaluz", "Ratonero Mallorquin", "Ratonero Murciano", "Ratonero Valenciano", "Redbone Coonhound", "Rhodesian Ridgeback", "Romanian Mioritic Shepherd Dog", "Romanian Raven Shepherd Dog", "Rottweiler", "Rough Collie", "Russian Spaniel", "Russian Toy", "Russo-European Laika", "Ryukyu Inu", "Saarloos Wolfdog", "Saint Bernard", "Saint Hubert Jura Hound", "Saint-Usuge Spaniel", "Saluki", "Samoyed", "Sapsali", "Sarabi dog", "Sardinian Shepherd Dog", "Šarplaninac", "Schapendoes", "Schipperke", "Schweizer Laufhund", "Schweizerischer Niederlaufhund", "Scottish Deerhound", "Scottish Terrier", "Sealyham Terrier", "Segugio dell'Appennino", "Segugio Italiano", "Segugio Maremmano", "Serbian Hound", "Serbian Tricolour Hound", "Serrano Bulldog", "Shar Pei", "Shetland Sheepdog", "Shiba Inu", "Shih Tzu", "Shikoku", "Shiloh Shepherd", "Siberian Husky", "Silken Windhound", "Silky Terrier", "Sinhala Hound", "Skye Terrier", "Sloughi", "Slovakian Wirehaired Pointer", "Small Greek domestic dog", "Smooth Collie", "Smooth Fox Terrier", "Soft-Coated Wheaten Terrier", "South Russian Ovcharka", "Spanish Mastiff", "Spanish Water Dog", "Spinone Italiano", "Sporting Lucas Terrier", "Stabyhoun", "Staffordshire Bull Terrier", "Standard Schnauzer", "Stephens Stock", "Styrian Coarse-haired Hound", "Sussex Spaniel", "Swedish Elkhound", "Swedish Lapphund", "Swedish Vallhund", "Swedish White Elkhound", "Taigan", "Taiwan Dog", "Tamaskan Dog", "Tazy", "Teddy Roosevelt Terrier", "Telomian", "Tenterfield Terrier", "Terrier Brasileiro", "Thai Bangkaew Dog", "Thai Ridgeback", "Tibetan Mastiff", "Tibetan Spaniel", "Tibetan Terrier", "Tornjak", "Tosa", "Toy Fox Terrier", "Toy Manchester Terrier", "Transylvanian Hound", "Treeing Cur", "Treeing Feist", "Treeing Tennessee Brindle", "Treeing Walker Coonhound", "Trigg Hound", "Tyrolean Hound", "Vikhan", "Villano de Las Encartaciones", "Villanuco de Las Encartaciones", "Vizsla", "Volpino Italiano", "Weimaraner", "Welsh Sheepdog", "Welsh Springer Spaniel", "Welsh Terrier", "West Country Harrier", "West Highland White Terrier", "West Siberian Laika", "Westphalian Dachsbracke", "Wetterhoun", "Whippet", "White Shepherd", "White Swiss Shepherd Dog", "Wire Fox Terrier", "Wirehaired Pointing Griffon", "Wirehaired Vizsla", "Xiasi Dog", "Xoloitzcuintle", "Yakutian Laika", "Yorkshire Terrier", "Alaunt", "Alpine Mastiff", "Argentine Polar Dog", "Belgian Mastiff", "Black and Tan Terrier", "Blue Paul Terrier", "Braque Dupuy", "Bull and terrier", "Bullenbeisser", "Chien-gris", "Chiribaya Dog", "Cordoba Fighting Dog", "Cumberland Sheepdog", "Cur", "Dalbo dog", "Dogo cubano", "Dumfriesshire Black and Tan Foxhound", "English Water Spaniel", "English White Terrier", "Fila da Terceira", "Grand Fauve de Bretagne", "Halls Heeler", "Hare Indian Dog", "Hawaiian Poi Dog", "Kurī", "Lapponian Shepherd", "Limer", "Marquesan Dog", "Molossus", "Moscow Water Dog", "Norfolk Spaniel", "North Country Beagle", "Old Croatian Sighthound", "Old English Bulldog", "Old Spanish Pointer", "Paisley Terrier", "Polynesian Dog", "Rache", "Rastreador Brasileiro", "Russian Tracker", "Saint John's water dog", "Sakhalin Husky", "Salish Wool Dog", "Sleuth hound", "Southern Hound", "Tahitian Dog", "Tahltan Bear Dog", "Talbot Hound", "Tesem", "Toy Bulldog", "Toy Trawler Spaniel", "Turnspit dog", "Tweed Water Spaniel", "Welsh Hillman" };
    
        // Choose 5 breeds and their corresponding percentages.
        String[] theChosenOnes = selectDistinctN(dogBreeds, 5);
        int[] distributions = partitionNumber(100, 5);
        
        System.out.printf("Well then, I have this highly reliable report on %s's prestigious background right here.\n\n", dogName);
        System.out.printf("%s is:\n\n", dogName);
        
        for (int i = 0; i < theChosenOnes.length; i++)
            System.out.printf("%d%% %s\n", distributions[i], theChosenOnes[i]);
        
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");
    }
    
    // Function for copying elements from source array to destination array.
    
    public static void copyAndTrim(String[] src, String[] dest){
        int maxLength = Integer.min(src.length, dest.length);
        for (int i = 0; i < maxLength; i++){
            dest[i] = src[i];
        }
    }
    
    // Function for exchanging element between two indices of array
    
    public static void exchangeElement(String[] arr, int index1, int index2){
        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    // Function for choosing n elements from string array at random.
    // If n is 0 or less, returns empty array.
    
    public static String[] selectDistinctN(String[] arr, int n){
        if (n <= 0)
            return new String[0];
        Random rnd = new Random();
        int maxLength = Integer.min(n, arr.length - 2);
        String[] results = arr.clone();
        
        for (int i = 0; i < maxLength; i++){
            int currentRnd = rnd.nextInt(results.length - i) + i;
            
            // Swapping elements

            exchangeElement(results, i, currentRnd);
        }
        
        if (n >= results.length)
            return results;
        else {
            String[] temp = new String[n];
            copyAndTrim(results, temp);
            return temp;
        }
    }
    
    // Function for partioning number into some number of parts.
    // If number of parts is less than 1 or greater than number itself, return empty array.
    
    public static int[] partitionNumber(int number, int numberOfParts){
        Random rnd = new Random();
        int remaining = number;
        if (numberOfParts < 1 || numberOfParts > number)
            return new int[0];
        int[] results = new int[numberOfParts];
        for (int i = numberOfParts - 1; i >= 0; i--){
            // Ensure that the partition is never zero by subtracting the
            // number of parts that are not assigned except for the partition
            // in this current loop.
            // If this is last iteration, assign the remainging to the chosen
            
            int chosen = i == 0 ? remaining : rnd.nextInt(remaining - i) + 1;
            
            remaining -= chosen;
            
            // Assign the results into array from "left" to "right
            
            results[numberOfParts - 1 - i] = chosen;
        }
        return results;
    }
}

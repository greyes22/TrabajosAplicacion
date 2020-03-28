public class ContadorPalabras {
    
    public String palabrasComunes (String[] string1, String[] string2){
        String palabrasComunes = "";
        String stringEntero2 = "";
     
        //Paso todo el texto 1 a un solo string para despues poder ver si las palabras del otro texto estan contenidas en el
        stringEntero2 += String.join(" ", string1);
        
        //Separo el texto 2 en palabras 
        for (int g = 0; g <= string1.length; g++){
            String[] palabrasTxt2 = string2[g].split(" "); 
            
            //Agarro cada una de las palabras separadas anteriormente y valido si estan contenidas en el string del texto 1, 
            //Si estan contenidas en el string del texto 1, las agrego al string final es el que voy a devolver con las palabras duplicadas previamente validando que ya no este agregada.
            for (int k = 0; k < palabrasTxt2.length; k++){
                if ((stringEntero2.contains(palabrasTxt2[k])) && ((palabrasComunes.contains(palabrasTxt2[k]))!=true)){
                    palabrasComunes += palabrasTxt2[k] + " ";
                }
            }
        }
    return palabrasComunes;
    }
}

/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    // instance variables - replace the example below with your own
    private String[] key;

    private int[] value;

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        key = new String[0];
        value = new int[0];
    }

    /**
     * Asocia el valor especificado con la clave especificada. Si la clave existía, 
     * entonces sobreescribe su valor y devuelve el valor antiguo. Si no existía devuelve -1.
     */
    public int put(String clave,int valor)
    {
        int resultado = 0;
        for (int i = 0; i < key.length; i++)
        {
            if (clave == key[i] )
            {
              
            }else
            {
                String[] array3 = key;
                key = new String[array3.length + 1];
                for (int count = 0; count < array3.length; count++)
                {
                    key[count] = array3[count];
                }
                key[array3.length] = clave;
                int[] array2 = value;
                value = new int[array2.length + 1];
                for (int count = 0; count < array2.length; count++)
                {
                    value[count] = array2[count];
                }
                value[array2.length] = valor;
                resultado = -1;
            }
        }
 
        return resultado;
    }
    /**
     * devuelve true si el mapa no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean vacio = true;
        if(key.length > 0)
        {
            vacio = false;
        }
        return vacio;
    }
    /**
     * devuelve el número de elementos del mapa.
     */
    public int size()
    {
        return key.length;
    }
    public void clear()
    {
        key = new String[0];
        value = new int[0];
    }
}


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
        if (isEmpty())
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
        else{
            for (int i = 0; i < key.length; i++)
            {
                if (clave.contains(key[i]))
                {
                    resultado = value[i];
                    value[i]=valor;
                }
                else
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
        }
        return resultado;
    }

    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave)
    {
        int resultado = -1;
        for (int i = 0; i< key.length && resultado == -1;i++)
        {
            if (clave == key[i])
            {
                resultado = value[i];
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

    /**
     *  vacía el mapa.
     */
    public void clear()
    {
        key = new String[0];
        value = new int[0];
    }

    /**
     * Devuelve true si el mapa contiene la clave dada.
     */
    public boolean containsKey(String clave)
    {
        boolean contiene = false;
        for (int i = 0; i< key.length && contiene == false;i++)
        {
            if (clave == key[i])
            {
                contiene = true;
            }
        }
        return contiene;
    }

    /**
     * Devuelve true si el mapa contiene el valor dado.
     */
    public boolean containsValue(int valor)
    {
        boolean contiene = false;
        for (int i = 0; i< value.length && contiene == false;i++)
        {
            if (valor == value[i])
            {
                contiene = true;
            }
        }
        return contiene;
    }
    /**
     * elimina del mapa el elemento con la clave dada y devuelve su valor. Si no hay esa clave en el mapa devuelve -1.
     */
    public int remove(String clave)
    {
        int valor = -1;
        for (int i = 0; i< key.length;  i++)
        {
            if (clave == key[i])
            {
                valor = value[i];
                String[] nuevo = key;
                key = new String[key.length-1];
                for (int a = 0; a < key.length; a++)
                {
                    key[a] = nuevo[a];
                }
                for (int b = i ; i< key.length; b++)
                {
                    key[b] = nuevo[b+1];
                }
                int[] nuevo1 = value;
                value = new int[value.length-1];
                for (int a = 0; a < value.length; a++)
                {
                    
                    value[a] = nuevo1[a];
                }
                for (int b = i ; i< key.length; b++)
                {
                    value[b] = nuevo1[b+1];
                    
                }
                
            }
        }
        return valor;
    }
    
}


# Втора лабораториска вежба по Софтверско инженерство

</br>

Марија Стојанова , бр. на индекс 193163

</br>

Control Flow Graph

</br>

![lab2_si](https://user-images.githubusercontent.com/102327517/171292750-e6b2538c-53da-41cb-8525-008fbb8fdf45.png)

</br>

Цикломатска комплексност

</br>

Цикломатската комплекснот на графот е 9.Оваа комплекснот е најдена на 2 начини.Првиот начин е по број на внатрешни региони и тоа се 9. Вториот начин е по формулата V(G)=E-N+2 ,каде што Е ни означува број на ребра -36,N ни означува број на јазли -29.
V(G)= E-N+2 =36-29+2=9 

</br>
Тест случаи според критериумот Every statement
</br>

![siLab2](https://user-images.githubusercontent.com/102327517/171293445-6eb0d702-3d21-4896-8192-acd8070be4b6.png)

</br>
    void everyStatmentTest()
    {
        IllegalArgumentException ex;
        ex= assertThrows(IllegalArgumentException.class, () ->lab2_si.function(newArrayList(Arrays.asList())));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex=assertThrows(IllegalArgumentException.class, () ->lab2_si.function(new ArrayList(Arrays.asList("7","8","9","10","11"))));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
    }
</br>

Со овие два тест случаи се опфатени линиите код 1-8,35.Во првиот тест должината на низата е нула и програмата паѓа а во вториот тест случај должината на низата е 5 елементи и повторно програмата фрла Exception.

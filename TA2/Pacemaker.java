package TA2;

/*
Ejercicio 3
a) Crear una clase "Marcapasos" que contenga variables para almacenar esta
información. Utilice los tipos de datos primitivos de java teniendo en cuenta que se
quiere consumir la menor cantidad de memoria posible.
b) Calcular cuánta memoria consume un objeto de su clase (considerando solamente el
espacio ocupado por las variables indicadas).
c) Responder las preguntas presentadas en pantalla
*/

public class Pacemaker{

    private short bloodPressure; // 2 bytes
    private short heartRate; // 2 bytes
    private short sugarInBlood; // 2 bytes
    private long maxForce; // 8 bytes
    private float minTimeBetweenHeartbeats; // 4 bytes
    private double remainingBattery; // 8 bytes
    private char manufacturerCode1, manufacturerCode2, manufacturerCode3, manufacturerCode4;
    private char manufacturerCode5, manufacturerCode6, manufacturerCode7, manufacturerCode8; // 2*8 bytes
    }

    /*
    en total podemos calcular cuanto ocupa en memoria un objeto de la clase Marcapasos unicamente teniendo en cuenta
    sus atributos sumando: 2 + 2 + 2 + 8 + 4 + 8 + 16 = 42 bytes
    */
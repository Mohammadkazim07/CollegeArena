package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Ecesem4sylActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Credits> creditsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecesem4syl);
        recyclerView = findViewById(R.id.recyclerview);

        initData();
        setRecyclerView();
    }
    private void setRecyclerView() {
        CreditsAdapter creditsAdapter = new CreditsAdapter(creditsList);
        recyclerView.setAdapter(creditsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        creditsList = new ArrayList<>();
        creditsList.add(new Credits("OBJECT ORIENTED PROGRAMMING", "L:3 T:0 P:4 Credits:5", "", "1. Introduction to C++ : Object Oriented Technology, Advantages of OOP, Input- output in C++, Tokens,\n" +
                "Keywords, Identifiers, Data Types C++, Derives data types. The void data type, Type Modifiers, Typecasting,\n" +
                "Constant, Operator, Precedence of Operators, Strings. Lecture : 3\n" +
                "2. Control Structures : Decision making statements like if-else, Nested if-else, goto, break, continue, switch\n" +
                "case, Loop statement like for loop, nested for loop, while loop, do-while loop. Lecture : 3\n" +
                "3. Functions : Parts of Function, User- defined Functions, Value- Returning Functions, void Functions, Value\n" +
                "Parameters, Function overloading, Virtual Functions. Lecture : 3\n" +
                "4. Classes and Data Abstraction : Structure in C++, Class, Build- in Operations on Classes, Assignment\n" +
                "Operator and Classes, Class Scope, Reference parameters and Class Objects (Variables), Member functions,\n" +
                "Accessor and Mutator Functions, Constructors, default Constructor, Destructors. Lecture : 15\n" +
                "5. Overloading & Templates : Operator Overloading, Function Overloading, Function Templates, Class\n" +
                "Templates. Lecture : 5\n" +
                "6. Inheritance : Single and Multiple Inheritance, virtual Base class, Abstract Class, Pointer and Inheritance,\n" +
                "Overloading Member Function. Lecture : 5\n" +
                "7. Pointers and Arrays : Void Pointers, Pointer to Class, Pointer to Object, The this Pointer, Void Pointer,\n" +
                "Arrays. Lecture : 6\n" +
                "8. Exception Handling : The keywords try, throw and catch. Creating own Exception Classes, Exception\n" +
                "Handling Techniques (Terminate the Program, Fix the Error and Continue, Log the Error and Continue), Stack\n" +
                "Unwinding. Lecture : 5\n" +
                "Text Books :\n" +
                "1. Thinking in C++, Volume 1 & 2 by Bruce Eckel, Chuck Allison, Pearson Education\n" +
                "2. Mastering C++, 1/e by Venugopal, Tata McGraw Hill.\n" +
                "3. Object Oriented Programming with C++, 3/e by E. Balaguruswamy, Tata McGraw Hill.\n" +
                "4. Starting Out with Object Oriented Programming in C++, by Tony Gaddis, Wiley India.\n" +
                "Reference Books :\n" +
                "1. The C++ Programming language 3/e by Bjarne Stroustrup, Pearson Education.\n" +
                "2. C++, How to Programme, 4e, by Deitel, Pearson Education.\n" +
                "3. Big C++ by Cay Horstmann, Wiley India.\n" +
                "4. C++ Primer, 3e by Stanley B. Lippmann, Josee Lajoie, Pearson Education.\n" +
                "5. C++ and Object Oriented Programming Paradigm, 2e by Debasish Jana, PHI.\n" +
                "6. Programming with C++, 2/e by Ravichandran, Tata McGraw Hill.\n" +
                "7. C++ Programming Black Book by Steven Holzner, Dreamtech Press."));
        creditsList.add(new Credits("DIGITAL ELECTRONICS", "L:3 T:0 P:4 Credits:5", "", "1. Digital Principle : Analog vs Digital, Number system, Computer Codes, Digital Signals, Waveforms Positive\n" +
                "and Negative logic, Logic Gate : basic, universal and others, Truth Table, Logic functions, IC Chips, Timing Diagram,\n" +
                "Electrical analogy. Lecture : 4\n" +
                "2. Boolean laws and theorems : Logic functions, conversion of logic functions into truth table and vice versa.\n" +
                "SOP and POS forms of representation, min terms and max terms, simplification of logic functions by theorems and\n" +
                "Karnaugh’s map, don’t care conditions, design of special purpose computers and related practical problems.\n" +
                "Lecture : 5\n" +
                "3. Analysis and synthesis of combinational logic circuits : Adder and substructures (look ahead adders),\n" +
                "Multiplexers, de multiplexers, Encoders, decoders, code convertors, magnitude comparators, parity generators and\n" +
                "checkers. Lecture : 6\n" +
                "4. Integrated circuit logic families : RTL, DTL, TTL, CMOS, IIL/I2L (integrated injection logic & emitter coupled\n" +
                "logic). Lecture : 45. Sequential circuit blocks and latches, flip flops- race around condition, master slave and edge triggered, SR,\n" +
                "JK, D & T Flip Flop, shift registers, counters- synchronous and asynchronous: design of ripple counter. Lecture : 10\n" +
                "6. Timing circuit : multi vibrators, mono stable and astable timer: LM555. Lecture : 4\n" +
                "7. Use of building blocks in designing larger systems such as digital to analog converters(DAC) weighted\n" +
                "resistors and r-2r , analog to digital(ADC)- comparator, counter and succession. Lecture : 5\n" +
                "8. Memories : static and dynamic RAMs, ROM, EPROM, EEPROM. Lecture : 4\n" +
                "Text Books :\n" +
                "1. Digital systems - Principles and Applications by Tocci, Widmar and Jain, Pearson\n" +
                "2. Digital fundamentals by Floyd And Jain, Pearson\n" +
                "Reference books :\n" +
                "1. Fundamentals of VHDL design by Stephen Brown and Zovenkeo Vraseseic, TMH\n" +
                "2. Introduction To Logic Design With Cd Rom by Alan B Marcovity, TMH,\n" +
                "3. Fundamentals Of Digital Logic With Verilog Design by Stephen Brown, TMH\n" +
                "4. Modern digital electronics by R.P Jain, TMH\n" +
                "EC 1x03 INTRODUCTION TO COMMUNICATION SYSTEMS\n" +
                "L-T-P: 3-0-3 Credit : 5\n" +
                "1. Periodic signals (sinusoidal, rectangular, saw tooth and triangular wave) and its Fourier series expansion\n" +
                "with single side representation in real frequency domain and with double side representation in rotating phasor\n" +
                "domain. Lecture : 3\n" +
                "2. Aperiodic signal : A signal pulse event and its Fourier transform; impulse response of a linear time invariant\n" +
                "system, convolution and response to arbitrary input. Lecture : 3\n" +
                "3. Block diagram of communication system and comparative study of analog and digital communication.\n" +
                "Lecture : 3\n" +
                "4. Modulation (upward frequency translation) & demodulation (downward frequency translation) and the need for\n" +
                "modulation: broad classification of modulation [linear (amplitude-AM) and exponential (frequency-FM and phase-PM)]\n" +
                "Lecture : 3\n" +
                "5. Generation of double side band (DSB) with carrier, double side band with suppressed carrier (DSBSC) and\n" +
                "single side band with suppressed carrier: demodulation of double side band with carrier – incoherent detector or\n" +
                "envelope detector, peak diode detector, coherent or synchronous detection of DSBSC and single side band with\n" +
                "suppressed carrier. Lecture : 6\n" +
                "6. Analog pulse, modulation : PAM, PWM, PPM and demodulation; comparative study of various analog pulse\n" +
                "modulation; comparison of incoherent and coherent detection. Lecture : 6\n" +
                "7. Superhetrodyne Receivers : Intermediate Frequency and its advantages, alignment and tracking, image\n" +
                "rejection and IC version of the Receiver. Lecture : 3\n" +
                "7. Frequency Multiplexing in carrier Telephony. Lecture : 1\n" +
                "8. Generation of FM signals (direct and indirect methods) and demodulation. Lecture : 3\n" +
                "9. Comparative study of SNR in AM, FM and PM System and use of emphasis Circuit in FM for SNR\n" +
                "optimization. Lecture : 2\n" +
                "10. Television-block diagram of the transmitter and receiver : description and working of video camera ;description\n" +
                "working of B-W colour TV receiver ;description of the composite signal in B-W colour TV. Lecture : 6\n" +
                "11. CCD Flat Panel Displays. Lecture : 3\n" +
                "Text Book :\n" +
                "1. Radio systems for Technicians by D.C.Green, Longman.\n" +
                "Reference Books ;\n" +
                "1. Communication system by Bruce carison . TMH.\n" +
                "2. Electronic Communication system by Kennedy IV Edition. TMH.\n" +
                "3. Electronic Communication system by Roddey & Coolen, Pearson.\n" +
                "4. Telecommunication system Engg. by Freeman John Wiley\n" +
                "5. Communication system by Haykin,Wile"));
        creditsList.add(new Credits("ELECTRICAL AND ELECTRONIC MATERIAL", "L:3 T:0 P:4 Credits:5", "", "1. Band theory of Solids : Energy band diagram, E – K Diagram, Reduced E – K Diagram, Insulators,\n" +
                "Semiconductors & Conductors. Lecture : 6\n" +
                "2. Dielectric behavior of materials : Polarization, Dielectric constant at low frequency & high frequency, Dielectric\n" +
                "loss, Piezo Electricity & Ferro Electricity. Lecture : 6\n" +
                "3. Magnetic behavior of materials : Diamagnetism, Para magnetism, Ferromagnetism & Ferrimagnetisms, Soft &\n" +
                "Hard magnetic materials and their applications. Lecture : 6\n" +
                "4. Semiconductor : Single Crystal, Poly Crystal and Amorphous, Fermi – Dirac Distribution, Hall effect, Intrinsic &\n" +
                "Extrinsic, N type & P type, Crystal growth – (1.) Preparation of electronic grade poly crystal in Siemens reactor,\n" +
                "(2.) Czochrarloski Method & Float Zone method of bulk single crystal ingot preparation (3.) Mirror finished wafer\n" +
                "preparation (4.) Epitaxial film growth – Chemical vapor phase deposition & Liquid phase epitaxy (5.) Molecular\n" +
                "beam epitaxy. Lecture : 12\n" +
                "5. Concepts of Phonons : Quantization of lattice vibration. Lecture : 2\n" +
                "6. Special classification of semiconductor material : Degenerate (Semi-Metal) and none degenerate\n" +
                "semiconductor: Elemental and compound semiconductor, direct & indirect band gap material. Lecture : 3\n" +
                "7. Superconductors : Low & High temperature (YBaCuO) superconductors, Meissner effect, Applications.\n" +
                "Lecture : 3\n" +
                "8. Printed Circuit Board : Manufacturing process, Single & Double sided boards, surface mounted devices.\n" +
                "Lecture : 6\n" +
                "Reference Books:\n" +
                "1. Solid State Physics by Kittel, McGraw Hill.\n" +
                "2. Principles of Electric Engineering Materials & Devices by S.O. Kasp, McGraw Hill.\n" +
                "3. Structure & properties of materials (VOL VI), Electronic Properties by Robert M. Rose, Lawrence A.\n" +
                "Shepherd & John Wulf, Wiley Eastern Ltd.\n" +
                "EC 1x13 ELECTRICAL & ELECTRONIC MATERIAL LAB\n" +
                "1. Four point probe for resistively measurement.\n" +
                "2. Measurement of Hall Effect in semiconductor"));
        creditsList.add(new Credits("NUMERICAL METHOD AND COMPUTATIONAL TECHNIQUES", "L:3 T:0 P:4 Credits:5", "", ""));
        creditsList.add(new Credits("PERSONAL MANAGEMENT AND INDUSTRIAL RELATIONS", "L:3 T:0 P:4 Credits:5", "", "1. Meaning, concept, function, & importance of personnel management, role of a personnel manager, personnel\n" +
                "policies - Need of a personnel policies, organization of personnel Department ( functional basis, service basis and\n" +
                "chentile basis) Lecture : 5\n" +
                "2. Manpower planning : Meaning & concept, need for manpower planning, types of manpower planning,\n" +
                "meaning and concept of job analysis, job description & job specification, uses of job analysis information,\n" +
                "Recruitment, selection – meaning and steps of selection process, meaning of induction Lecture : 8\n" +
                "3. Training and develop : Meaning, need & importance for training, method of training, development - meaning\n" +
                "of development, method of development. Lecture : 5\n" +
                "4. (a) Performance appraised : Meaning, Objective, method of performance appraisal .\n" +
                "(b) Transfer : meaning objective, types.\n" +
                "(c) Promotion : Meaning , policies, basis of promotion.(d) Separation : Resignation, Discharge & Dismissal, Suspension & Retrenchment, Layoff.\n" +
                "Lecture : 6\n" +
                "5. Wages and salary administration :\n" +
                "(a) Meaning purpose & principle of wage & salary administration, factors influencing wage & salary\n" +
                "administration.\n" +
                "(b) Meaning of wage &salary, minimum wage , fair wage& living , wage.\n" +
                "(c) Meaning of money and real wage.\n" +
                "(d) Methods of wage payment - time rate & piece rate.\n" +
                "(e) Incentive- Financial Incentive& non financial Incentive, method of wage payment based on result.\n" +
                "Lecture : 7\n" +
                "6. (a) Health, safety and welfare facilities.\n" +
                "(b) social security -\n" +
                "(i) meaning and concepts, objective.\n" +
                "(ii) form of social security- social insurance &social assistance.\n" +
                "( c) Problem arising from disease , invalidity , accident, old age and unemployment.\n" +
                "Lecture : 5\n" +
                "7. (a) Industrial Relation : meaning & concept, changing concept of industrial relation, role played by the\n" +
                "employer, trade union & government, current I. R. position in India, I.R. policies of government of India.\n" +
                "(b) Trade Union : Meaning and concept, objective, functions, type, method of trade union.\n" +
                "Lecture : 6\n" +
                "Text Books :\n" +
                "1. Personal management by C.B.Memoria & G.V. Gankar- himalaya\n" +
                "2. Personal management & industrial relation by P.C.Tripathi-S.chand\n" +
                "Reference Book :\n" +
                "1. Industrial relation, Trade Union & Labour Relation by G.P.Sinha & PRN Sinha, Pearson"));
    }
}
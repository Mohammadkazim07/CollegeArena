package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Ecesem3sylActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Credits> creditsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecesem3syl);
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
        creditsList.add(new Credits("ORGANIZATIONAL BEHAVIOR AND INDUSTRIAL PSYCHOLOGY", "L:3 T:0 P:4 Credits:5", "", "1. Concept of organization & organizational Behavior. Lecture : 2 " +
                "2. " +
                "(a) Personality : meaning, concept , determinants, personality theories (psychoanalytic Theory, Trait Theory and " +
                "Self Theory). " +
                "(b) Perception-meaning , concept, process of perception, significance of perception. " +
                "(c) Leaning- meaning, concept, nature, component of leaning process. " +
                "(d) Attitude- meaning, concept, factors in attitude formation, method of finding Employee’s attitude. " +
                "(e) Value - Meaning and types, value and attitude – similarity and difference. " +
                "(f) Motivation- meaning, theory of motivation (Maslow's Theory & Herzberg's Theory). Lecture : 11 " +
                "3. " +
                "(a) Group & Group Dynamics - concept, importance, classification of groups , reason for group, formation, group " +
                "cohesiveness. " +
                "(b) Team work :meaning , concept, types , creating, an effective team. Lecture : 4 " +
                "4. " +
                "(a) Communication- concept, process, importance, barrier. " +
                "(b) Organizational conflict- meaning, concept, types, stages of conflict, resolution of conflict. " +
                "(c) Power & politics- nature and concept, Ethics of power & politics, types of power. " +
                "(d) Leadership- concept, qualities and functions of a leader, approaches to the analysis of leadership " +
                " Lecture : 8 " +
                "5. Concept of organization theory, concept of organization structure, form of organizational structure,form of " +
                "organizational culture. Lecture : 7 " +
                "6. " +
                "(a) Organizational effectiveness - concept , approaches, criteria of effectiveness. " +
                "(b) Organizational change - meaning, factors in Organizational change, process of planned change. " +
                "(c) Organizational Development - concept ,need of organizational development, difference between organizational " +
                "development & management development. Lecture : 7 " +
                "Text Books : " +
                " 1. Organizational behavior by Stephen P. Robbin & Seema Sanghi- pearson " +
                " 2. Organizational behavior by L.M. Prasad-S Chand & sons " +
                "Reference Book : " +
                "1. Organization behavior: managing people and organization by Gregory moorehead – Biztantra"));
        creditsList.add(new Credits("SOLID STATE PHYSICS AND DEVICES", "L:3 T:0 P:4 Credits:5", "", "1. History of development of electronic devices. Lecture : 3 " +
                "2. Review of device physics : Photo-ionic emission, thermionic emission, gas discharge tubes, vacuum tubes\u0002diodes, triodes, tetrads and pentodes. Lecture : 3 " +
                "3. Crystal growth : Bulk and epitaxial Lecture : 1 " +
                "4. IC technology : Oxidation, diffusion, ion implantation, lithography, thin film deposition (CVD, sputtering, " +
                "evaporation,) process integration, process flow for PN diodes, BJT and MOSFETS fabrication. " +
                " Lecture : 5 " +
                "5. Physics and technology of classical diodes : " +
                "• Semiconductor carrier modelling- bonding model, energy band model, carriers, band gap, carrier " +
                "properties(effective mass, intrinsic carrier concentration, doping) density of states, Fermi function, equilibrium " +
                "carrier concentration (formula for n and p and np product). Charge neutrality relationship, determination of Fermi " +
                "level, carrier conc. Temperature dependence. " +
                "• Carrier Action Drift Mobility Drift Current, Resistivity, Diffusion Current. Total current. relation between the " +
                "diffusion constants. And mobility (Einstein’s relationship). Recombination generation (Band to Band, R-G " +
                "Centres, Auger, impact ionization). Equation of state Continuity equation, Minority Carrier Diffusion Equation. " +
                "• PN Junction Diode Step junction, Built-in potential, Depletion width. Depletion Approximation .Electrostatic " +
                "relationship (charge density depletion with potential , electric field )for Va=0 and Va<>0 Ideal Diode" +
                "Equation(qualitative and quantitative derivation :Band Model , Assumptions Approximation .Boundary Condition " +
                "),Deviation from Ideal (R-G Current, series Resistance ,High Level Injection ).Junction Breakdown (Avalanche " +
                "and Zener),Reverse Bias Junction Capacitance ,forward Bias Diffusion Capacitance ,Qualitative understanding " +
                "of Turn on and Turn-off transients. " +
                "• Zener Diode Backward diode Tunnel diodes Varactor diode, Schottky diode. Lecture : 13 " +
                "6. Physics and technologies of BJT : operational considerations, modes and configurations, performance " +
                "parameters (emitter efficiency, base transport factor, common base current gain, common emitter current gain " +
                "and their derivation for an ideal transistor, deviation from ideal (base width modulation punch through, avalanche " +
                "breakdown, geometrical effects, R-G current), small signal modelling, qualitative understanding of switch " +
                "response. Lecture : 6 " +
                "7. Physics and technologies of FET : Junction FET(theory of application, I-V relationship), MOS " +
                "capacitor(energy band diagram, gate voltage relationship, capacitance- voltage characteristics), MOSFET ( " +
                "theory of operation, threshold voltage, I-V characteristics) NON IDEAL MOS (M-S work function difference, " +
                "oxide charges, threshold adjustment and considerations) Lecture : 5 " +
                "8. Physics and technologies of UJT and SCR : silicon controlled rectifier(theory of operation, switching " +
                "consideration), uni junction transistor(theory of operation) Lecture : 2 " +
                "9. Photonics : Photo diodes (pin and avlanche), solar cell, LED , solid state LASER diodes. Lecture : 3 " +
                "10. CCD and CCD cameras. Lecture : 1 " +
                "Text Book : " +
                "1. Solid sate electronic devices by Streetmen And Banerjee, Pearson: " +
                "2. Basic principles- semiconductor physics and devices by Nearmen,TMH " +
                "3. Semiconductor devices by Kano, Pearson " +
                "References : " +
                "1. Electronic Materials and Devices by Kasp. TMP. " +
                "2. Theory of Semiconductor Devices by Karl Hess, PHI. " +
                "3. Semiconductor Devices by Jasprit Singh, Wiley Student Edition. " +
                "4. Device electronics for Integrated Circuits by Muller & Kamins, Wiley Student Edition. "));
        creditsList.add(new Credits("BASIC ELECTRONICS", "L:3 T:0 P:4 Credits:5", "", "1. PN junction diode : Depletion layer, barrier potential, forward and reverse bias, break down voltage, PIV " +
                "characteristics of PN junction diode, knee voltage, ideal PN junction diode, junction capacitance, break down " +
                "diode(zener diode). " +
                "Photo diode and light emitting diode. Lecture : 10 " +
                "2. Rectifiers and filters :\n\n Half wave and full wave rectifiers(centre tape and bridge), regulation ripple factor, R-C " +
                ",L-C and Pi filters. Clipping and clamping circuit, voltage multiplier. Lecture : 8 " +
                "3. BJT introduction :\n\n Basic theory and operation of PNP and NPN transistors, characteristics of C-B,C-E,C-C " +
                "configuration. " +
                "Biasing : Base bias, emitter feedback bias, voltage divider bias, load line, operating point. " +
                "Incremental analysis using h model. Lecture : 12 " +
                "4. FET : \n\nintroduction, operation, JFET parameters, JFET characteristics, JFET amplifiers. " +
                "MOS FET : Introduction, operation , MOSFET parameters . Lecture : 4 " +
                "5. Feedback amplifiers.\n\n " +
                "6. Integrated circuit :\n\n Characteristics of ideal, operational amplifiers. Application as inverting, non inverting " +
                "amplifiers. Summer, difference, differentiator, integrator.  " +
                "7. Principle and application of SCR and UJT.  " +
                "Text Books :\n\n " +
                "1. Electronic devices and circuit theory by Boylestad and Nashelsky, Pearson " +
                "2. Electronic principle by Albert Malvino & Davis J Bates, TMH " +
                "3. Art of electronics by Paul H Horowitz, Oxford "));
        creditsList.add(new Credits("ELECTRICAL MACHINE-1", "L:3 T:0 P:4 Credits:5", "", "1. DC Generator :\n\n Constructional Feature and types of D.C. Machines, Types of armature winding, Action of " +
                "Commutator, Principle of D.C. generator, Induced EMF, Armature reaction, Commutation, Compensating " +
                "Winding and Inter Poles, External & Internal Characteristics of D.C. Generator, Critical Resistance, Critical " +
                "Speed. " +
                "2. D.C. Motor : \n\nPrinciple of D.C. Motors , Back EMF, Torque and Speed of D.C. Motors, Losses and Efficiency, " +
                "Characteristics, Starting and Speed Control of Various types of D.C. Motors Lecture : 6 " +
                "3. Single Phase Transformer : \n\nBasic Principle, Types and Construction of Single Phase Transformer, EMF " +
                "equation, Equivalent Circuits, Phasor Diagram, Losses and efficiency Testing, Voltage Regulation, per unit " +
                "system, Losses and Efficiency, Parallel Operation of Single Phase Transformer. Lecture : 10 " +
                "4. Auto Transformer :\n\n Working Principle, Saving of Conductor, Advantage and Disadvantage of Auto Transformer." +
                "5. Three Phase Transformer : \n\nIntroduction, Types, Phasor Group, Parallel Operation of three Phase Transformer, " +
                "Cooling of Transformer.  " +
                "6. Three Phase Induction Motor : \n\nConstruction, Types and Principle of three Phase Induction Motors, Production " +
                "of rotating field, slip, Equivalent Circuit and Phasor Diagram, Mechanical Power Developed, Maximum torque, " +
                "Torque-Slip Characteristics, Losses and efficiency, Starting, Testing and speed control of Induction Motor. " +
                "Text Book : \n\n" +
                " 1. Electrical Machine by Samarjit Ghosh, Pearson Education Pvt. Ltd. " +
                " 2. Electrical Machine by P.S Bimbra, Khanna Publication. " +
                " 3. Electrical Machine by Nagrath, I . J and Kothari D.P. TMH. " +
                " 4. Electrical Machinery by Fitzgerald A.E & Kingsley TMH " +
                " 5. Direct Current Machine by E.W.Daws. "));

        creditsList.add(new Credits("INDUSTRIAL ECONOMICS AND ACCOUNTANCY", "L:3 T:0 P:4 Credits:5", "", "1. Various definitions of Economics :\n\n Nature of Economic Problem, Relation between science, Engineering. " +
                "Technology & Economics " +
                "2. Meaning of demand, Law of Demand, Elasticity of demand, Practical importance & application of the concept " +
                "of elasticity of Demand " +
                "3. Meaning of Production and factor of Production : \n\nLand, labor, Capital ,Entrepreneur & Organization –their " +
                "Characteristics law of variable Proportion .Return to Scale Lecture : 5 " +
                "4. Cost Analysis :\n\n Various concept of cost, Cost function, Short & Long run cost. Concept of Revenue ,Break\u0002Even Analysis Lecture : 5 " +
                "5. Meaning of Market :\n\n Type of market – Perfect completion, Monopoly ,Oligopoly ,Monopolistic competition " +
                ",Main feature of these market ), Meaning of Supply and Law of Supply, R ole of Demand & Supply in price in prime " +
                "determination imperfect t competition Lecture : 7 " +
                "6. Engineering Economy :\n\n " +
                " (a) Simple and compound interest, Annuities, (b)Basic methods For making economy Studies - (i) Present" +
                "worth method, (ii) Future worth method (iii)I.R.R method (c) Comparison of alternative – (i) Present worth method, (ii\\) " +
                "Future Worth method (iii) I.R.R method. Lecture : 7 " +
                "7. Accounting:\n\n Meaning Scope and Role of accounting , Accounting concept & Convention. Accounting as " +
                "information System. Recording of transaction in journal and Ledgers. Trial –Balance, Preparation of final Account." +
                "Text Book : \n\n" +
                " 1. Modern Micro Economics by Theory - H.L.Ahuja-S.Chand " +
                " 2. Advance Economic Theory by M .L.Jhingan- Konark Publication " +
                " 3. Engineering Economics by Degarmo , Sullican & Canada –McMillan " +
                " 4. Double Entry Book Keeping by T.S.Grewal –S .Chand " +
                "Reference Books : " +
                " 1. Stonier & Hague by A test book of Economic Theory-Pearson " +
                " 2. Industrial Organisation and Engg. Economics by Banga & Sharma "));
        creditsList.add(new Credits("MATHEMATICS-3", "L:3 T:0 P:4 Credits:5", "", "1. ORDINARY DIFFERENTIAL EQUATIONS &SPECIAL FUNCTIONS : \n\nSeries solution of differential equations " +
                "(Frobenious method), Bessel's equation, Its solution, Bessel's function of first & second kind, Recurrence formula, " +
                "Legendre's equation, Its solution, Legendre polynomials, Rodrigue's formula, Orthogonality of Legendre polynomial." +
                "2. PARTIAL DIFFERENTIAL EQUATION : \n\nBasic concept, 1st & 2nd order linear & quasi – linear partial " +
                "differential equation, Classification of second order P.D.E., Boundary and initial conditions, wave equations, " +
                "Separation of variables, use of fourier series, D’Alembert’s solution of wave equation, Heat equation, Solution by " +
                "fourier series. " +
                "3. COMPLEX ANALYSIS - I : \n\nFunction of complex variables – limit, continuity, differentiability and analyticity of " +
                "functions Cauchy-Riemann equations, Laplace’s equation, harmonic function, Cauchy’s integral theorem, Cauchy’s " +
                "integral formula, Taylor’s and Laurent series, Residues and its applications to evaluating real integrals. " +
                "4. PROBABILITY & STATISTICS :\n\n Theorems on probability, including Baye's rule, Random variable – " +
                "cumulative distribution function, Probability mass function, probability density function, Mathematical expectation, " +
                "mean variance, moment, generating function & characteristics function, standard probability models Binomials, " +
                "Poisson exponential, Weibull, normal and lognormal, sampling & sampling distribution, Chi- square and F " +
                "distributions, large and small sample tests of significance. Lecture : 12 " +
                "Text Books :\n\n " +
                "1. Advanced Engineering Mathematics by R.K.Jain & S.R.K. Iyengar " +
                "2. Higher engineering mathematics by B.S. Grewal " +
                "3. Fundamentals of mathematical statistics by V.K.Kapoor & S.C. Gupta- sultan & sons " +
                "References : " +
                "1. Advance Engineering Mathematics by E.Kreyszig 8th edition , John Wiley & sons " +
                "2. Complex variable and applications by Churchill & Brown –McGraw hill " +
                "3. Elements of Partial Differential equation by I.N.Sneddon - McGraw Hill " +
                "4. Introduction to Probability & Statistics for engineering by S.M.Ross – John Wiley and Sons, New York."));
    }
}
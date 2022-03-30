package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Csesem7Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Credits> creditsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem7);

        recyclerView=findViewById(R.id.recyclerview);

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
        creditsList.add(new Credits("BIOLOGY FOR ENGINEERS","L:3 T:0 P:4 Credits:5","",
                "Module 1: Introduction \n\n" +
                        "Purpose: To convey that Biology is as important a scientific discipline as Mathematics, Physics " +
                        "and Chemistry. " +
                        "Bring out the fundamental differences between science and engineering by drawing a " +
                        "comparison between eye and camera, Bird flying and aircraft. Mention the most exciting aspect " +
                        "of biology as an independent scientific discipline. Why we need to study biology? Discuss how " +
                        "biological observations of 18th Century that lead to major discoveries. Examples from Brownian " +
                        "motion and the origin of thermodynamics by referring to the original observation of Robert Brown " +
                        "and Julius Mayor. These examples will highlight the fundamental importance of observations in " +
                        "any scientific inquiry.\n \n" +
                        "Module 2: Classification \n\n" +
                        "Purpose: To convey that classification per se is not what biology is all about. The underlying " +
                        "criterion, such as morphological, biochemical or ecological be highlighted. " +
                        "Hierarchy of life forms at phenomenological level. A common thread weaves this hierarchy " +
                        "Classification. Discuss classification based on (a) cellularity- Unicellular or multicellular (b) " +
                        "ultrastructure- prokaryotes or eucaryotes. (c) energy and Carbon utilisation -Autotrophs, " +
                        "heterotrophs, lithotropes (d) Ammonia excretion – aminotelic, uricoteliec, ureotelic (e) Habitataacquatic or terrestrial (f) Molecular taxonomy- three major kingdoms of life. A given organism " +
                        "can come under different category based on classification. Model organisms for the study of " +
                        "biology come from different groups. E.coli, S.cerevisiae, D. Melanogaster, C. elegance, A. n" +
                        "Thaliana, M. musculus.\n\n" +
                        "Module 3: Genetics Lecture: 4 hrs.\n\n" +
                        "Purpose: To convey that “Genetics is to biology what Newton’s laws are to Physical Sciences” " +
                        "Mendel’s laws, Concept of segregation and independent assortment. Concept of allele. Gene " +
                        "mapping, Gene interaction, Epistasis. Meiosis and Mitosis be taught as a part of genetics. Emphasis " +
                        "to be give not to the mechanics of cell division nor the phases but how genetic material passes from " +
                        "parent to offspring. Concepts of recessiveness and dominance. Concept of mapping of phenotype " +
                        "to genes. Discuss about the single gene disorders in humans. Discuss the concept of " +
                        "complementation using human genetics.\n\n" +
                        "Module 4: Biomolecules \n\n" +
                        "Purpose: To convey that all forms of life has the same building blocks and yet the manifestations " +
                        "are as diverse as one can imagine." +
                        "Molecules of life. In this context discuss monomeric units and polymeric structures. Discuss " +
                        "about sugars, starch and cellulose. Amino acids and proteins. Nucleotides and DNA/RNA. Two " +
                        "carbon units and lipids.\n\n" +
                        "Module 5: Enzymes \n\n" +
                        "Purpose: To convey that without catalysis life would not have existed on earth Enzymology: How " +
                        "to monitor enzyme catalysed reactions. How does an enzyme catalyse reactions? Enzyme " +
                        "classification. Mechanism of enzyme action. Discuss at least two examples. Enzyme kinetics and " +
                        "kinetic parameters. Why should we know these parameters to understand biology? RNA catalysis.\n\n" +
                        "Module 6: Information Transfer \n\n" +
                        "Purpose: The molecular basis of coding and decoding genetic information is universal Molecular " +
                        "basis of information transfer. DNA as a genetic material. Hierarchy of DNA structure- from single " +
                        "stranded to double helix to nucleosomes. Concept of genetic code. Universality and degeneracy " +
                        "of genetic code. Define gene in terms of complementation and recombination. \n\n" +
                        "Module 7: Macromolecular analysis \n\n" +
                        "Purpose: How to analyse biological processes at the reductionist level Proteins- structure and " +
                        "function. Hierarch in protein structure. Primary secondary, tertiary and quaternary structure. " +
                        "Proteins as enzymes, transporters, receptors and structural elements.\n\n" +
                        "Module 8: Metabolism \n\n" +
                        "Purpose: The fundamental principles of energy transactions are the same in physical and " +
                        "biological world. " +
                        "Thermodynamics as applied to biological systems. Exothermic and endothermic versus " +
                        "endergonic and exergoinc reactions. Concept of Keqand its relation to standard free energy. " +
                        "Spontaneity. ATP as an energy currency. This should include the breakdown of glucose to CO2" +
                        "+ H2O (Glycolysis and Krebs cycle) and synthesis of glucose from CO2 and H2O " +
                        "(Photosynthesis). Energy yielding and energy consuming reactions. Concept of Energy charge.\n\n" +
                        "Module 9: Microbiology \n\n" +
                        "Purpose: Concept of single celled organisms. Concept of species and strains. Identification and " +
                        "classification of microorganisms. Microscopy. Ecological aspects of single celled organisms. " +
                        "Sterilization and media compositions. Growth kinetics.\n\n\n" +
                        "Suggested Reference Books:\n\n" +
                        "1. Biology: A global approach: Campbell, N. A.; Reece, J. B.; Urry, Lisa; Cain, M, L.; " +
                        "Wasserman, S. A.; Minorsky, P. V.; Jackson, R. B. Pearson Education Ltd\n" +
                        "2. Outlines of Biochemistry, Conn, E.E; Stumpf, P.K; Bruening, G; Doi, R.H. John Wiley and " +
                        "Sons\n" +
                        "3. Principles of Biochemistry (V Edition), By Nelson, D. L.; and Cox, M. M.W.H. Freeman and " +
                        "Company\n" +
                        "4. Molecular Genetics (Second edition), Stent, G. S.; and Calender, R. W.H. Freeman and " +
                        "company, Distributed by Satish Kumar Jain for CBS Publisher\n" +
                        "5. Microbiology, Prescott, L.M J.P. Harley and C.A. Klein 1995. 2nd edition Wm, C. Brown\n\n\n "));
        creditsList.add(new Credits("OPEN ELECTIVE - I","L:3 T:0 P:4 Credits:5","","ehfewygre"));
        creditsList.add(new Credits("SUMMER ENTERPRENEURSHIP - III","L:3 T:0 P:4 Credits:5","","ehfewygre"));
        creditsList.add(new Credits("Professional Elective Lab II","L:3 T:0 P:4 Credits:5","","ehfewygre"));
        creditsList.add(new Credits("Elective-III","L:3 T:0 P:4 Credits:5","","ehfewygre"));
        creditsList.add(new Credits("Project- I","L:3 T:0 P:4 Credits:5","","ehfewygre"));


    }

}
package td2;

public class Temps {
 int heur, min, sec;

 public Temps() {
 }

 ;

 public Temps(int heur) {
  this.heur = heur;
 }

 public Temps(int heur, int min) {
  this.heur = heur;
  this.min = min;

 }

 public Temps(int heur, int min, int sec) {
  this.heur = heur;
  this.min = min;
  this.sec = sec;

 }

 public Temps(Temps t) {
  this.heur = t.heur;
  this.min = t.min;
  this.sec = t.sec;
 }

 public int getHeur() {
  return heur;
 }

 public void setHeur(int heur) {
  this.heur = heur;
 }

 public int getMin() {
  return min;
 }

 public void setMin(int min) {
  this.min = min;
 }

 public int getSec() {
  return sec;
 }

 public void setSec(int sec) {
  this.sec = sec;
 }

 public void ajouterheures(int h) {
  this.heur = this.heur + h;
  if (heur > 23) {
   this.heur = this.heur % 24;
  }
 }
 public void ajoutemininute(int m){
  this.min=this.min=m;
  if(min>59){
   ajouterheures(min/60);
   this.min=min%60;
  }
 }

 @Override
 public String toString() {
  return "Temps{" +
          "heur=" + heur +
          ", min=" + min +
          ", sec=" + sec +
          '}';
 }

 public void ajouteseconde(int s){
  this.sec=this.sec+s;
  if(sec>59){
   ajoutemininute(sec/60);
   this.sec=sec%60;
  }

 }


}
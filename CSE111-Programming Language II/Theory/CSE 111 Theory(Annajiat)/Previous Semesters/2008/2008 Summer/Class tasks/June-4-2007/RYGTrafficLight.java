// The "RYG " prefix stands for the Red , Yellow , and Green colors that
// this light can assume assume.
public class RYGTrafficLight {
// Colors are encoded as integers
  public final static int RED = 1;
  public final static int YELLOW = 2;
  public final static int GREEN = 3;
// The current color of the traffic light
  private int color;
// The constructor ensures that the light has a valid color
// (starts out red red)
  public RYGTrafficLight () {
    color = RED;
  }
  
  public RYGTrafficLight(int initialColor) {
    if (initialColor >= RED && initialColor <= GREEN) {
      color = initialColor;
    } else {
      color = RED; // defaults to red
    }
  }  
// Changes the light �s color to the next legal color in its normal cycle cycle.
// The light �s previous color is returned returned.
// The pattern is is:
// red --> green --> yellow
// � |
// | |
// +------------------+
  public void change () {
    if ( color == RED ) {
      color = GREEN ; // Green follows red
    } else if ( color == YELLOW ) {
      color = RED ; // Red follows yellow
    } else if ( color == GREEN ) {
      color = YELLOW ; // Yellow follows green
    }
  }
// Render the individual lamps
  public String drawLamps () {
    if ( color == RED ) {
      return "(R) ( ) ( )";
    } else if ( color == GREEN ) {
      return "( ) ( ) (G)";
    } else if ( color == YELLOW ) {
      return "( ) (Y) ( )";
    } else {
      return " ** Error ** "; // Defensive programming
    }
  }
// Render the light in a crude visual way
  public String draw () {
    return "[" + drawLamps () + "]";
  }
}
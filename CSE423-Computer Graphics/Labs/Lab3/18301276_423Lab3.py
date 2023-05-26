from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *


def convertToZone0(x, y, X, Y):

    a = y
    b = x

    glBegin(GL_POINTS)

    glVertex2f(a + X, b + Y)

    convertToZone1(a, b, X, Y)
    convertToZone2(a, b, X, Y)
    convertToZone3(a, b, X, Y)
    convertToZone4(a, b, X, Y)
    convertToZone5(a, b, X, Y)
    convertToZone6(a, b, X, Y)
    convertToZone7(a, b, X, Y)

    glEnd()

def convertToZone1(x, y, X, Y):
    a = y
    b = x
    glVertex2f(a + X, b + Y)

def convertToZone2(x, y, X, Y):
    a = -y
    b = x
    glVertex2f(a + X, b + Y)


def convertToZone3(x, y, X, Y):

    a = -x
    b = y

    glVertex2f(a + X, b + Y)


def convertToZone4(x, y, X, Y):

    a = -x
    b = -y

    glVertex2f(a + X, b + Y)


def convertToZone5(x, y, X, Y):

    a = -y
    b = -x

    glVertex2f(a + X, b + Y)


def convertToZone6(x, y, X, Y):

    a = y
    b = -x

    glVertex2f(a + X, b + Y)


def convertToZone7(x, y, X, Y):

    a = x
    b = -y

    glVertex2f(a + X, b + Y)


def midpointCircle(radius, X, Y):

    d = 1 - radius
    x = 0
    y = radius
    while (y > x):
        if(d < 0):
            d = d + (2*x) + 3
            x = x + 1
            convertToZone0(x, y, X, Y)

        else:
            d = d + (2*x) - (2*y) + 5
            x = x + 1
            y = y - 1
            convertToZone0(x, y, X, Y)



def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(-200, 200, -200, 200, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()


def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 0.0, 3.0)

    midpointCircle(100,0,0)
    midpointCircle(50,-50,0)
    midpointCircle(50,50,0)
    midpointCircle(50,0,50)
    midpointCircle(50,0,-50)

    glutSwapBuffers()


glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(200, 200)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)

glutMainLoop()

package MyPackage;
import org.lwjgl.opengl.GL11;

class apartment {

static String TextureName = "apartment.mtl";

static int Vertices = 112;

static int VertTexts = 504;

static int Normals = 504;

static int Faces = 168;

static int SmoothGroups = 2;

static float[][] VertArray = new float[][]{
{ 0.95f, 0.2f, 0.05f},
{ 0.95f, 0.2f, 0.3f},
{ 0.4f, 0.2f, 0.3f},
{ 0.4f, 0.2f, 0.0500001f},
{ 0.4f, 0f, 0.0500001f},
{ 0.4f, 0f, 0.3f},
{ 0.95f, 0f, 0.3f},
{ 0.95f, 0f, 0.05f},
{ 0.4f, 0f, 0.0500001f},
{ 0.4f, 0f, 0.5f},
{ 0.05f, 0f, 0.5f},
{ 0.05f, 0f, 0.05f},
{ 0.05f, 0.2f, 0.05f},
{ 0.05f, 0.2f, 0.5f},
{ 0.4f, 0.2f, 0.5f},
{ 0.4f, 0.2f, 0.0500001f},
{ 0.285617f, 0.156636f, 0.5f},
{ 0.292277f, 0.156636f, 0.5f},
{ 0.292277f, 0.156636f, 0.544406f},
{ 0.285617f, 0.156636f, 0.544406f},
{ 0.285617f, 0.102953f, 0.544406f},
{ 0.292277f, 0.102953f, 0.544406f},
{ 0.292277f, 0.102953f, 0.5f},
{ 0.285617f, 0.102953f, 0.5f},
{ 0.159096f, 0.156636f, 0.544406f},
{ 0.292276f, 0.156636f, 0.544406f},
{ 0.292276f, 0.156636f, 0.551741f},
{ 0.159096f, 0.156636f, 0.551741f},
{ 0.159096f, 0.115737f, 0.551741f},
{ 0.292276f, 0.115737f, 0.551741f},
{ 0.292276f, 0.115737f, 0.544406f},
{ 0.159096f, 0.115737f, 0.544406f},
{ 0.159096f, 0.102953f, 0.5f},
{ 0.292276f, 0.102953f, 0.5f},
{ 0.292276f, 0.102953f, 0.551741f},
{ 0.159096f, 0.102953f, 0.551741f},
{ 0.159096f, 0.115737f, 0.551741f},
{ 0.292276f, 0.115737f, 0.551741f},
{ 0.292276f, 0.115737f, 0.5f},
{ 0.159096f, 0.115737f, 0.5f},
{ 0.159096f, 0.102953f, 0.5f},
{ 0.165755f, 0.102953f, 0.5f},
{ 0.165755f, 0.102953f, 0.544406f},
{ 0.159096f, 0.102953f, 0.544406f},
{ 0.159096f, 0.156636f, 0.544406f},
{ 0.165755f, 0.156636f, 0.544406f},
{ 0.165755f, 0.156636f, 0.5f},
{ 0.159096f, 0.156636f, 0.5f},
{ 0.844305f, 0.102953f, 0.3f},
{ 0.850964f, 0.102953f, 0.3f},
{ 0.850964f, 0.102953f, 0.344406f},
{ 0.844305f, 0.102953f, 0.344406f},
{ 0.844305f, 0.156636f, 0.344406f},
{ 0.850964f, 0.156636f, 0.344406f},
{ 0.850964f, 0.156636f, 0.3f},
{ 0.844305f, 0.156636f, 0.3f},
{ 0.717784f, 0.115737f, 0.344406f},
{ 0.850964f, 0.115737f, 0.344406f},
{ 0.850964f, 0.115737f, 0.351741f},
{ 0.717784f, 0.115737f, 0.351741f},
{ 0.717784f, 0.156636f, 0.351741f},
{ 0.850964f, 0.156636f, 0.351741f},
{ 0.850964f, 0.156636f, 0.344406f},
{ 0.717784f, 0.156636f, 0.344406f},
{ 0.717783f, 0.115737f, 0.3f},
{ 0.850964f, 0.115737f, 0.3f},
{ 0.850964f, 0.115737f, 0.351741f},
{ 0.717783f, 0.115737f, 0.351741f},
{ 0.717783f, 0.102953f, 0.351741f},
{ 0.850964f, 0.102953f, 0.351741f},
{ 0.850964f, 0.102953f, 0.3f},
{ 0.717783f, 0.102953f, 0.3f},
{ 0.717783f, 0.156636f, 0.3f},
{ 0.724443f, 0.156636f, 0.3f},
{ 0.724443f, 0.156636f, 0.344406f},
{ 0.717783f, 0.156636f, 0.344406f},
{ 0.717783f, 0.102953f, 0.344406f},
{ 0.724443f, 0.102953f, 0.344406f},
{ 0.724443f, 0.102953f, 0.3f},
{ 0.717783f, 0.102953f, 0.3f},
{ 0.626521f, 0.156636f, 0.3f},
{ 0.63318f, 0.156636f, 0.3f},
{ 0.63318f, 0.156636f, 0.344406f},
{ 0.626521f, 0.156636f, 0.344406f},
{ 0.626521f, 0.102953f, 0.344406f},
{ 0.63318f, 0.102953f, 0.344406f},
{ 0.63318f, 0.102953f, 0.3f},
{ 0.626521f, 0.102953f, 0.3f},
{ 0.5f, 0.156636f, 0.344406f},
{ 0.63318f, 0.156636f, 0.344406f},
{ 0.63318f, 0.156636f, 0.351741f},
{ 0.5f, 0.156636f, 0.351741f},
{ 0.5f, 0.115737f, 0.351741f},
{ 0.63318f, 0.115737f, 0.351741f},
{ 0.63318f, 0.115737f, 0.344406f},
{ 0.5f, 0.115737f, 0.344406f},
{ 0.5f, 0.102953f, 0.3f},
{ 0.63318f, 0.102953f, 0.3f},
{ 0.63318f, 0.102953f, 0.351741f},
{ 0.5f, 0.102953f, 0.351741f},
{ 0.5f, 0.115737f, 0.351741f},
{ 0.63318f, 0.115737f, 0.351741f},
{ 0.63318f, 0.115737f, 0.3f},
{ 0.5f, 0.115737f, 0.3f},
{ 0.5f, 0.102953f, 0.3f},
{ 0.506659f, 0.102953f, 0.3f},
{ 0.506659f, 0.102953f, 0.344406f},
{ 0.5f, 0.102953f, 0.344406f},
{ 0.5f, 0.156636f, 0.344406f},
{ 0.506659f, 0.156636f, 0.344406f},
{ 0.506659f, 0.156636f, 0.3f},
{ 0.5f, 0.156636f, 0.3f}};

static float[][] TextArray = new float[][]{
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f},
{ 1f, 0f},
{ 0f, 1f},
{ 0f, 0f},
{ 0f, 1f},
{ 1f, 0f},
{ 1f, 1f},
{ 1f, 1f},
{ 0f, 0f},
{ 1f, 0f},
{ 0f, 0f},
{ 1f, 1f},
{ 0f, 1f}};

static float[][] NormArray = new float[][]{
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 1f, 0f, -2.38419e-007f},
{ 1f, 0f, -2.38419e-007f},
{ 1f, 0f, -2.38419e-007f},
{ 1f, 0f, -2.38419e-007f},
{ 1f, 0f, -2.38419e-007f},
{ 1f, 0f, -2.38419e-007f},
{ -6.77325e-008f, 0f, -1f},
{ -6.77325e-008f, 0f, -1f},
{ -6.77325e-008f, 0f, -1f},
{ -6.77325e-008f, 0f, -1f},
{ -6.77325e-008f, 0f, -1f},
{ -6.77325e-008f, 0f, -1f},
{ 5.4186e-008f, 0f, 1f},
{ 5.4186e-008f, 0f, 1f},
{ 5.4186e-008f, 0f, 1f},
{ 5.4186e-008f, 0f, 1f},
{ 5.4186e-008f, 0f, 1f},
{ 5.4186e-008f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 9.57932e-008f, 0f, -1f},
{ 9.57932e-008f, 0f, -1f},
{ 9.57932e-008f, 0f, -1f},
{ 9.57932e-008f, 0f, -1f},
{ 9.57932e-008f, 0f, -1f},
{ 9.57932e-008f, 0f, -1f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ -1f, 0f, 9.10627e-008f},
{ -1f, 0f, 9.10627e-008f},
{ -1f, 0f, 9.10627e-008f},
{ -1f, 0f, 9.10627e-008f},
{ -1f, 0f, 9.10627e-008f},
{ -1f, 0f, 9.10627e-008f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ 1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ -1f, 0f, 0f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, -1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 0f, 1f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, 1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f},
{ 0f, -1f, 0f}};

static int[][] FaceArray = new int[][]{
{ 8, 1, 1, 6, 2, 2, 5, 3, 3, 1},
{ 6, 4, 4, 8, 5, 5, 7, 6, 6, 1},
{ 2, 7, 7, 4, 8, 8, 3, 9, 9, 1},
{ 4, 10, 10, 2, 11, 11, 1, 12, 12, 1},
{ 4, 13, 13, 6, 14, 14, 3, 15, 15, 1},
{ 6, 16, 16, 4, 17, 17, 5, 18, 18, 1},
{ 8, 19, 19, 2, 20, 20, 7, 21, 21, 1},
{ 2, 22, 22, 8, 23, 23, 1, 24, 24, 1},
{ 8, 25, 25, 4, 26, 26, 1, 27, 27, 1},
{ 4, 28, 28, 8, 29, 29, 5, 30, 30, 1},
{ 6, 31, 31, 2, 32, 32, 3, 33, 33, 1},
{ 2, 34, 34, 6, 35, 35, 7, 36, 36, 1},
{ 15, 37, 37, 11, 38, 38, 10, 39, 39, 1},
{ 11, 40, 40, 15, 41, 41, 14, 42, 42, 1},
{ 13, 43, 43, 9, 44, 44, 12, 45, 45, 1},
{ 9, 46, 46, 13, 47, 47, 16, 48, 48, 1},
{ 15, 49, 49, 9, 50, 50, 16, 51, 51, 1},
{ 9, 52, 52, 15, 53, 53, 10, 54, 54, 1},
{ 11, 55, 55, 13, 56, 56, 12, 57, 57, 1},
{ 13, 58, 58, 11, 59, 59, 14, 60, 60, 1},
{ 13, 61, 61, 15, 62, 62, 16, 63, 63, 1},
{ 15, 64, 64, 13, 65, 65, 14, 66, 66, 1},
{ 11, 67, 67, 9, 68, 68, 10, 69, 69, 1},
{ 9, 70, 70, 11, 71, 71, 12, 72, 72, 1},
{ 22, 73, 73, 24, 74, 74, 23, 75, 75, 2},
{ 24, 76, 76, 22, 77, 77, 21, 78, 78, 2},
{ 20, 79, 79, 18, 80, 80, 17, 81, 81, 2},
{ 18, 82, 82, 20, 83, 83, 19, 84, 84, 2},
{ 22, 85, 85, 20, 86, 86, 21, 87, 87, 2},
{ 20, 88, 88, 22, 89, 89, 19, 90, 90, 2},
{ 18, 91, 91, 24, 92, 92, 17, 93, 93, 2},
{ 24, 94, 94, 18, 95, 95, 23, 96, 96, 2},
{ 20, 97, 97, 24, 98, 98, 21, 99, 99, 2},
{ 24, 100, 100, 20, 101, 101, 17, 102, 102, 2},
{ 18, 103, 103, 22, 104, 104, 23, 105, 105, 2},
{ 22, 106, 106, 18, 107, 107, 19, 108, 108, 2},
{ 30, 109, 109, 32, 110, 110, 31, 111, 111, 2},
{ 32, 112, 112, 30, 113, 113, 29, 114, 114, 2},
{ 28, 115, 115, 26, 116, 116, 25, 117, 117, 2},
{ 26, 118, 118, 28, 119, 119, 27, 120, 120, 2},
{ 30, 121, 121, 28, 122, 122, 29, 123, 123, 2},
{ 28, 124, 124, 30, 125, 125, 27, 126, 126, 2},
{ 26, 127, 127, 32, 128, 128, 25, 129, 129, 2},
{ 32, 130, 130, 26, 131, 131, 31, 132, 132, 2},
{ 28, 133, 133, 32, 134, 134, 29, 135, 135, 2},
{ 32, 136, 136, 28, 137, 137, 25, 138, 138, 2},
{ 26, 139, 139, 30, 140, 140, 31, 141, 141, 2},
{ 30, 142, 142, 26, 143, 143, 27, 144, 144, 2},
{ 39, 145, 145, 35, 146, 146, 34, 147, 147, 2},
{ 35, 148, 148, 39, 149, 149, 38, 150, 150, 2},
{ 37, 151, 151, 33, 152, 152, 36, 153, 153, 2},
{ 33, 154, 154, 37, 155, 155, 40, 156, 156, 2},
{ 39, 157, 157, 33, 158, 158, 40, 159, 159, 2},
{ 33, 160, 160, 39, 161, 161, 34, 162, 162, 2},
{ 35, 163, 163, 37, 164, 164, 36, 165, 165, 2},
{ 37, 166, 166, 35, 167, 167, 38, 168, 168, 2},
{ 37, 169, 169, 39, 170, 170, 40, 171, 171, 2},
{ 39, 172, 172, 37, 173, 173, 38, 174, 174, 2},
{ 35, 175, 175, 33, 176, 176, 34, 177, 177, 2},
{ 33, 178, 178, 35, 179, 179, 36, 180, 180, 2},
{ 47, 181, 181, 43, 182, 182, 42, 183, 183, 2},
{ 43, 184, 184, 47, 185, 185, 46, 186, 186, 2},
{ 45, 187, 187, 41, 188, 188, 44, 189, 189, 2},
{ 41, 190, 190, 45, 191, 191, 48, 192, 192, 2},
{ 47, 193, 193, 41, 194, 194, 48, 195, 195, 2},
{ 41, 196, 196, 47, 197, 197, 42, 198, 198, 2},
{ 43, 199, 199, 45, 200, 200, 44, 201, 201, 2},
{ 45, 202, 202, 43, 203, 203, 46, 204, 204, 2},
{ 45, 205, 205, 47, 206, 206, 48, 207, 207, 2},
{ 47, 208, 208, 45, 209, 209, 46, 210, 210, 2},
{ 43, 211, 211, 41, 212, 212, 42, 213, 213, 2},
{ 41, 214, 214, 43, 215, 215, 44, 216, 216, 2},
{ 55, 217, 217, 51, 218, 218, 50, 219, 219, 2},
{ 51, 220, 220, 55, 221, 221, 54, 222, 222, 2},
{ 53, 223, 223, 49, 224, 224, 52, 225, 225, 2},
{ 49, 226, 226, 53, 227, 227, 56, 228, 228, 2},
{ 55, 229, 229, 49, 230, 230, 56, 231, 231, 2},
{ 49, 232, 232, 55, 233, 233, 50, 234, 234, 2},
{ 51, 235, 235, 53, 236, 236, 52, 237, 237, 2},
{ 53, 238, 238, 51, 239, 239, 54, 240, 240, 2},
{ 53, 241, 241, 55, 242, 242, 56, 243, 243, 2},
{ 55, 244, 244, 53, 245, 245, 54, 246, 246, 2},
{ 51, 247, 247, 49, 248, 248, 50, 249, 249, 2},
{ 49, 250, 250, 51, 251, 251, 52, 252, 252, 2},
{ 63, 253, 253, 59, 254, 254, 58, 255, 255, 2},
{ 59, 256, 256, 63, 257, 257, 62, 258, 258, 2},
{ 61, 259, 259, 57, 260, 260, 60, 261, 261, 2},
{ 57, 262, 262, 61, 263, 263, 64, 264, 264, 2},
{ 63, 265, 265, 57, 266, 266, 64, 267, 267, 2},
{ 57, 268, 268, 63, 269, 269, 58, 270, 270, 2},
{ 59, 271, 271, 61, 272, 272, 60, 273, 273, 2},
{ 61, 274, 274, 59, 275, 275, 62, 276, 276, 2},
{ 61, 277, 277, 63, 278, 278, 64, 279, 279, 2},
{ 63, 280, 280, 61, 281, 281, 62, 282, 282, 2},
{ 59, 283, 283, 57, 284, 284, 58, 285, 285, 2},
{ 57, 286, 286, 59, 287, 287, 60, 288, 288, 2},
{ 70, 289, 289, 72, 290, 290, 71, 291, 291, 2},
{ 72, 292, 292, 70, 293, 293, 69, 294, 294, 2},
{ 68, 295, 295, 66, 296, 296, 65, 297, 297, 2},
{ 66, 298, 298, 68, 299, 299, 67, 300, 300, 2},
{ 70, 301, 301, 68, 302, 302, 69, 303, 303, 2},
{ 68, 304, 304, 70, 305, 305, 67, 306, 306, 2},
{ 66, 307, 307, 72, 308, 308, 65, 309, 309, 2},
{ 72, 310, 310, 66, 311, 311, 71, 312, 312, 2},
{ 68, 313, 313, 72, 314, 314, 69, 315, 315, 2},
{ 72, 316, 316, 68, 317, 317, 65, 318, 318, 2},
{ 66, 319, 319, 70, 320, 320, 71, 321, 321, 2},
{ 70, 322, 322, 66, 323, 323, 67, 324, 324, 2},
{ 78, 325, 325, 80, 326, 326, 79, 327, 327, 2},
{ 80, 328, 328, 78, 329, 329, 77, 330, 330, 2},
{ 76, 331, 331, 74, 332, 332, 73, 333, 333, 2},
{ 74, 334, 334, 76, 335, 335, 75, 336, 336, 2},
{ 78, 337, 337, 76, 338, 338, 77, 339, 339, 2},
{ 76, 340, 340, 78, 341, 341, 75, 342, 342, 2},
{ 74, 343, 343, 80, 344, 344, 73, 345, 345, 2},
{ 80, 346, 346, 74, 347, 347, 79, 348, 348, 2},
{ 76, 349, 349, 80, 350, 350, 77, 351, 351, 2},
{ 80, 352, 352, 76, 353, 353, 73, 354, 354, 2},
{ 74, 355, 355, 78, 356, 356, 79, 357, 357, 2},
{ 78, 358, 358, 74, 359, 359, 75, 360, 360, 2},
{ 86, 361, 361, 88, 362, 362, 87, 363, 363, 2},
{ 88, 364, 364, 86, 365, 365, 85, 366, 366, 2},
{ 84, 367, 367, 82, 368, 368, 81, 369, 369, 2},
{ 82, 370, 370, 84, 371, 371, 83, 372, 372, 2},
{ 86, 373, 373, 84, 374, 374, 85, 375, 375, 2},
{ 84, 376, 376, 86, 377, 377, 83, 378, 378, 2},
{ 82, 379, 379, 88, 380, 380, 81, 381, 381, 2},
{ 88, 382, 382, 82, 383, 383, 87, 384, 384, 2},
{ 84, 385, 385, 88, 386, 386, 85, 387, 387, 2},
{ 88, 388, 388, 84, 389, 389, 81, 390, 390, 2},
{ 82, 391, 391, 86, 392, 392, 87, 393, 393, 2},
{ 86, 394, 394, 82, 395, 395, 83, 396, 396, 2},
{ 94, 397, 397, 96, 398, 398, 95, 399, 399, 2},
{ 96, 400, 400, 94, 401, 401, 93, 402, 402, 2},
{ 92, 403, 403, 90, 404, 404, 89, 405, 405, 2},
{ 90, 406, 406, 92, 407, 407, 91, 408, 408, 2},
{ 94, 409, 409, 92, 410, 410, 93, 411, 411, 2},
{ 92, 412, 412, 94, 413, 413, 91, 414, 414, 2},
{ 90, 415, 415, 96, 416, 416, 89, 417, 417, 2},
{ 96, 418, 418, 90, 419, 419, 95, 420, 420, 2},
{ 92, 421, 421, 96, 422, 422, 93, 423, 423, 2},
{ 96, 424, 424, 92, 425, 425, 89, 426, 426, 2},
{ 90, 427, 427, 94, 428, 428, 95, 429, 429, 2},
{ 94, 430, 430, 90, 431, 431, 91, 432, 432, 2},
{ 103, 433, 433, 99, 434, 434, 98, 435, 435, 2},
{ 99, 436, 436, 103, 437, 437, 102, 438, 438, 2},
{ 101, 439, 439, 97, 440, 440, 100, 441, 441, 2},
{ 97, 442, 442, 101, 443, 443, 104, 444, 444, 2},
{ 103, 445, 445, 97, 446, 446, 104, 447, 447, 2},
{ 97, 448, 448, 103, 449, 449, 98, 450, 450, 2},
{ 99, 451, 451, 101, 452, 452, 100, 453, 453, 2},
{ 101, 454, 454, 99, 455, 455, 102, 456, 456, 2},
{ 101, 457, 457, 103, 458, 458, 104, 459, 459, 2},
{ 103, 460, 460, 101, 461, 461, 102, 462, 462, 2},
{ 99, 463, 463, 97, 464, 464, 98, 465, 465, 2},
{ 97, 466, 466, 99, 467, 467, 100, 468, 468, 2},
{ 111, 469, 469, 107, 470, 470, 106, 471, 471, 2},
{ 107, 472, 472, 111, 473, 473, 110, 474, 474, 2},
{ 109, 475, 475, 105, 476, 476, 108, 477, 477, 2},
{ 105, 478, 478, 109, 479, 479, 112, 480, 480, 2},
{ 111, 481, 481, 105, 482, 482, 112, 483, 483, 2},
{ 105, 484, 484, 111, 485, 485, 106, 486, 486, 2},
{ 107, 487, 487, 109, 488, 488, 108, 489, 489, 2},
{ 109, 490, 490, 107, 491, 491, 110, 492, 492, 2},
{ 109, 493, 493, 111, 494, 494, 112, 495, 495, 2},
{ 111, 496, 496, 109, 497, 497, 110, 498, 498, 2},
{ 107, 499, 499, 105, 500, 500, 106, 501, 501, 2},
{ 105, 502, 502, 107, 503, 503, 108, 504, 504, 2}};

static int Temp = 0;

public static void Draw(float Height){
	
	
	for(int i = 0; i < Faces; i++ ){
		
		if (GetFaceData(i, 9) == 2){
			GL11.glColor3f(0.29f, 0.33f, 0.35f);
		}
		if (GetFaceData(i, 9) == 1){
			GL11.glColor3f(0.46f, 0.53f, 0.6f);
		}
		
        GL11.glBegin(GL11.GL_TRIANGLES);                    // Drawing Using Triangles
        
        Temp = GetFaceData(i, 2)-1;
        	GL11.glNormal3f( GetNormalData(Temp, 0), GetNormalData(Temp, 1), GetNormalData(Temp, 2));         
        Temp = GetFaceData(i, 0)-1;
            GL11.glVertex3f( GetVerticeData(Temp, 0), GetVerticeData(Temp, 1) + Height, GetVerticeData(Temp, 2));         
            
        Temp = GetFaceData(i, 5)-1;
        	GL11.glNormal3f( GetNormalData(Temp, 0), GetNormalData(Temp, 1), GetNormalData(Temp, 2));   
        Temp = GetFaceData(i, 3)-1;
        GL11.glVertex3f( GetVerticeData(Temp, 0), GetVerticeData(Temp, 1) + Height, GetVerticeData(Temp, 2));        
        
        Temp = GetFaceData(i, 8)-1;
    		GL11.glNormal3f( GetNormalData(Temp, 0), GetNormalData(Temp, 1), GetNormalData(Temp, 2));   
        Temp = GetFaceData(i, 6)-1;
            GL11.glVertex3f( GetVerticeData(Temp, 0), GetVerticeData(Temp, 1) + Height, GetVerticeData(Temp, 2));         
        GL11.glEnd();   
        
        }
	
	
}

public static int GetVertices() {
return Vertices;
}

public static int GetVertTexts() {
return VertTexts;
}

public static int GetNormals() {
return Normals;
}

public static int GetFaces() {
return Faces;
}

public static int GetSmoothGroups() {
return SmoothGroups;
}

public static Float GetVerticeData(int i, int d) {
return VertArray[i][d];
}

public static Float GetVerticeTextureData(int i, int d) {
return TextArray[i][d];
}

public static Float GetNormalData(int i, int d) {
return NormArray[i][d];
}

public static int GetFaceData(int i, int d) {
return FaceArray[i][d];
}


}

//Vertices: 112  Texture Co-ords: 504  Normals: 504  Texture: apartment.mtl Faces: 168 Smooth Groups: 2
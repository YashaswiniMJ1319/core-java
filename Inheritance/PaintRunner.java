class PaintRunner {

    public static void main(String... args) {

        Paint paint = new Paint();
        paint.applyPaint();
        paint.mixColor();
        paint.dryPaint();
        paint.removePaint();
        paint.storePaint();

        System.out.println("\n----------------------\n");

        Paint paint1 = new Paint();
        paint1.applyPaint();
        paint1.mixColor();
        paint1.dryPaint();
    }
	}
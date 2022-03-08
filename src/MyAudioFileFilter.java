/*
 * Decompiled with CFR 0_118.
 */
import java.io.File;
import javax.swing.filechooser.FileFilter;

class MyAudioFileFilter
extends FileFilter {
    MyAudioFileFilter() {
    }

    
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".au");
    }

    
    public String getDescription() {
        return ".au File (*.au)";
    }
}


package org.thepeacockproject.idea.intelligence.data;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class StateData {
    public @NotNull String name;
    public PsiElement anchor;

    public StateData(
            final @NotNull String name,
            final PsiElement anchor
    ) {
        this.name = name;
        this.anchor = anchor;
    }
}

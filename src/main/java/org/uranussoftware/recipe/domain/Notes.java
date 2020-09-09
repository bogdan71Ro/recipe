package org.uranussoftware.recipe.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

    public Notes() {
    }

    public Long getId() {
        return this.id;
    }

    public String getRecipeNotes() {
        return this.recipeNotes;
    }

    public Recipe getRecipe() {
        return this.recipe;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String toString() {
        return "Notes(id=" + this.getId() + ", recipeNotes=" + this.getRecipeNotes() + ", recipe=" + this.getRecipe() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Notes)) return false;
        final Notes other = (Notes) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$recipeNotes = this.getRecipeNotes();
        final Object other$recipeNotes = other.getRecipeNotes();
        if (this$recipeNotes == null ? other$recipeNotes != null : !this$recipeNotes.equals(other$recipeNotes))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Notes;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $recipeNotes = this.getRecipeNotes();
        result = result * PRIME + ($recipeNotes == null ? 43 : $recipeNotes.hashCode());
        return result;
    }
}

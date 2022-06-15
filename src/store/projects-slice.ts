import { createSlice } from '@reduxjs/toolkit'

export const projectsSlice = createSlice({
    name: 'projects',
    initialState: {
        hasEnteredVP: false,
        inViewport: false,
        hasLeftVP: false,
    },
    reducers: {
        setHasEnteredProjects: (state) => {
            state.hasEnteredVP = true;
            state.inViewport = true;
            state.hasLeftVP = false;
        },
        setHasLeftProjcets: (state) => {
            state.hasEnteredVP = false;
            state.inViewport = false;
            state.hasLeftVP = true;
        },
    },
})

// Action creators are generated for each case reducer function
export const { setHasEnteredProjects, setHasLeftProjcets } = projectsSlice.actions

export default projectsSlice.reducer
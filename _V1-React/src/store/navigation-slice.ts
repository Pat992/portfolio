import { createSlice } from '@reduxjs/toolkit'

export const navigationSlice = createSlice({
    name: 'navigation',
    initialState: {
        home: true,
        projects: false,
        skills: false,
    },
    reducers: {
        setMain: (state) => {
            state.home = true;
            state.projects = false;
            state.skills = false;
        },
        setProjects: (state) => {
            state.home = false;
            state.projects = true;
            state.skills = false;
        },
        setSkills: (state) => {
            state.home = false;
            state.projects = false;
            state.skills = true;
        },
    }
});

// Action creators are generated for each case reducer function
export const { setMain, setProjects, setSkills } = navigationSlice.actions

export default navigationSlice.reducer